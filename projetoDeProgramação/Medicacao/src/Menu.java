import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class Menu {
    private Scanner sc;
    private List<Paciente> pacientes = new ArrayList<>();
    private static final Map<String, Medicamento> MEDICAMENTOS_BASE = new HashMap<>();
    private List<Medicamento> threadsAtivas = new ArrayList<>();
    private Queue<Medicamento> filaReabastecimento = new ConcurrentLinkedQueue<>();
    private volatile boolean simulacaoGlobalAtiva = false;

    static {
        MEDICAMENTOS_BASE.put("IBUPROFENO", new Medicamento("Ibuprofeno", 6, 3, null, 7, null));
        MEDICAMENTOS_BASE.put("PARACETAMOL", new Medicamento("Paracetamol", 4, 4, null, 5, null));
        MEDICAMENTOS_BASE.put("LORATADINA", new Medicamento("Loratadina", 12, 2, null, 10, null));
        MEDICAMENTOS_BASE.put("DIPIRONA", new Medicamento("Dipirona", 8, 5, null, 0, null));
    }

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void iniciarMenu() {
        Thread inputThread = new Thread(() -> {
            while (simulacaoGlobalAtiva) {
                if (sc.hasNextLine() && sc.nextLine().equalsIgnoreCase("SAIR")) {
                    pararSimulacao();
                }
            }
        });

        int opcao;
        do {
            System.out.println("\n1 - Criar Paciente\n" +
                               "2 - Iniciar Medicação\n" +
                               "3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    criarPaciente();
                    break;
                case 2:
                    iniciarMedicacao();
                    if (simulacaoGlobalAtiva && !inputThread.isAlive()) {
                        inputThread.start();
                    }
                    break;
                case 3:
                    pararSimulacao();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    public void sinalizarReabastecimento(Medicamento med) {
        filaReabastecimento.add(med);
    }

    private void criarPaciente() {
        System.out.print("Nome do Paciente: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        short idade = sc.nextShort();
        System.out.print("Peso: ");
        float peso = sc.nextFloat();
        System.out.print("Altura: ");
        int altura = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual sintoma do paciente? 1-Dores, 2-Gripe, 3-Alergia, 4-Febre e Dor");
        int sintoma = sc.nextInt();
        sc.nextLine();

        List<String> nomesMedicamentos = new ArrayList<>();
        switch (sintoma) {
            case 1: nomesMedicamentos.add("IBUPROFENO"); break;
            case 2: nomesMedicamentos.add("PARACETAMOL"); break;
            case 3: nomesMedicamentos.add("LORATADINA"); break;
            case 4:
                nomesMedicamentos.add("PARACETAMOL");
                nomesMedicamentos.add("DIPIRONA");
                break;
            default: System.out.println("Sintoma inválido."); return;
        }

        String quadroClinicoChave = nomesMedicamentos.stream().sorted().collect(Collectors.joining(";"));
        Paciente molde = null;
        for (Paciente pExistente : pacientes) {
            if (pExistente.getQuadroClinicoChave().equals(quadroClinicoChave)) {
                molde = pExistente;
                System.out.println("-> Quadro clínico similar ao de '" + molde.getNome() + "' encontrado. Clonando tratamento...");
                break;
            }
        }

        Paciente novoPaciente;
        if (molde != null) {
            novoPaciente = new Paciente(molde, nome, idade, peso, altura, this);
        } else {
            System.out.println("-> Criando novo protocolo de tratamento...");
            novoPaciente = new Paciente(nome, idade, peso, altura);
            for (String nomeMed : nomesMedicamentos) {
                novoPaciente.adicionarMedicamento(new Medicamento(MEDICAMENTOS_BASE.get(nomeMed), novoPaciente, this));
            }
        }
        pacientes.add(novoPaciente);
        System.out.println("Paciente '" + novoPaciente.getNome() + "' cadastrado com sucesso.");
    }

    private void pararSimulacao() {
        this.simulacaoGlobalAtiva = false;
        for (Medicamento m : threadsAtivas) {
            m.pararTratamento();
        }
        System.out.println("\nSimulação de medicação interrompida.");
    }

    private void iniciarMedicacao() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        simulacaoGlobalAtiva = true;
        threadsAtivas.clear();
        for (Paciente p : pacientes) {
            for (Medicamento m : p.getMedicamentos()) {
                threadsAtivas.add(m);
                m.start();
            }
        }

        System.out.println("Sistema iniciado. Pressione ENTER para interromper.");
        
        while(simulacaoGlobalAtiva) {
            Medicamento medParaReabastecer = filaReabastecimento.poll();
            if (medParaReabastecer != null) {
                System.out.print("\nDeseja reabastecer " + medParaReabastecer.getNome() + " para " + medParaReabastecer.getPaciente().getNome() + "? [Sim/Nao]: ");
                String resposta = sc.nextLine().toUpperCase();

                if (resposta.equals("SIM")) {
                    Medicamento medBase = MEDICAMENTOS_BASE.get(medParaReabastecer.getNome().toUpperCase());
                    if (medBase != null) {
                        int quantidadePadrao = medBase.getQuantidade();
                        medParaReabastecer.setQuantidade(quantidadePadrao);
                        System.out.println(medParaReabastecer.getNome() + " foi reabastecido com " + quantidadePadrao + " unidades.");
                    }
                } else {
                    medParaReabastecer.pararTratamento();
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                simulacaoGlobalAtiva = false;
            }
        }
    }
}
