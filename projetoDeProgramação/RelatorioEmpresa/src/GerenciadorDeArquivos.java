import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeArquivos {

    public static void inicializarArquivos() {
        try {
            File pasta = new File("persist");
            File arquivoDepartamento = new File("persist/departamentos.csv");
            File arquivoFuncionario = new File("persist/funcionarios.csv");

            if (!pasta.exists()) {
                pasta.mkdir();
            }

            if (!arquivoDepartamento.exists()) {
                arquivoDepartamento.createNewFile();
            }

            if (!arquivoFuncionario.exists()) {
                arquivoFuncionario.createNewFile();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void salvarTodosOsDados(Map<Integer, Funcionario> mapaFuncionarios, Map<String, Departamento> mapaDepartamentos) {
        try {
            FileWriter writerFunc = new FileWriter("persist/funcionarios.csv", false);
            for (Funcionario func : mapaFuncionarios.values()) {
                writerFunc.write(func.toCSV());
            }
            writerFunc.close();

            FileWriter writerDep = new FileWriter("persist/departamentos.csv", false);
            for (Departamento depart : mapaDepartamentos.values()) {
                writerDep.write(depart.toCSV());
            }
            writerDep.close();
            
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados");
            throw new RuntimeException(e);
        }
    }


    public static void carregarDadosFuncionarios(Map<Integer, Funcionario> mapaFuncionarios) {
        try (Scanner leitor = new Scanner(new File("persist/funcionarios.csv"))) {

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(",");

                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String sobrenome = dados[2];
                Departamento departamento = new Departamento(dados[3], null);
                float salario = Float.parseFloat(dados[4]);
                String cargo = dados[5];

                Funcionario func = new Funcionario(id, nome, sobrenome, departamento, salario, cargo);
                mapaFuncionarios.put(id, func);
            }
        } catch (Exception e) {
            System.out.println("Aviso: Iniciando com banco de dados vazio (funcionários).");
        }
    }

    public static void carregarDadosDepartamentos(Map<String, Departamento> mapaDepartamento) {
        try (Scanner leitor = new Scanner(new File("persist/departamentos.csv"))) {

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();

                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(",");

                String nome = dados[0];
                int idGerente = 0;

                Funcionario gerente = null;
                if (idGerente != 0) {
                    gerente = new Funcionario(idGerente, "Nome", "Sobrenome", null, 0.0f, "Cargo");
                }
                
                Departamento depart = new Departamento(nome, gerente);

                mapaDepartamento.put(nome, depart);
            }
        } catch (Exception e) {
            System.out.println("Aviso: Iniciando com banco de dados vazio (departamentos).");
        }
    }

    public static void exibirRelatorio() {
        System.out.println("-----RELATÓRIO GERAL-----");
        System.out.println("Funcionários: ");

        try {
            List<String> linhas = Files.readAllLines(Paths.get("persist/funcionarios.csv"));

            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println("");
        System.out.println("Departamentos: ");

        try {
            List<String> linhas = Files.readAllLines(Paths.get("persist/departamentos.csv"));

            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}