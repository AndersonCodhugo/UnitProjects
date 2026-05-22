import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Paciente {
    private String nome;
    private short idade;
    private float peso;
    private int altura;
    private List<Medicamento> medicamentos;

    public Paciente(String nome, short idade, float peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.medicamentos = new ArrayList<>();
    }

    public Paciente(Paciente pacienteOriginal, String novoNome, short novaIdade, float novoPeso, int novaAltura, Menu menu) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.peso = novoPeso;
        this.altura = novaAltura;
        this.medicamentos = new ArrayList<>();

        for (Medicamento medOriginal : pacienteOriginal.getMedicamentos()) {
            Medicamento medClonado = new Medicamento(medOriginal, this, menu);
            this.medicamentos.add(medClonado);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void adicionarMedicamento(Medicamento med) {
        this.medicamentos.add(med);
    }

    public String getQuadroClinicoChave() {
        if (medicamentos.isEmpty()) {
            return "";
        }
        return medicamentos.stream()
                .map(Medicamento::getNome)
                .sorted()
                .collect(Collectors.joining(";"));
    }
}
