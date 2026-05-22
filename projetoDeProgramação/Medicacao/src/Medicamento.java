public class Medicamento extends Thread {
    private String nome;
    private int periodicidade;
    private int quantidade;
    private Paciente paciente;
    private int periodoDeUso;
    private volatile boolean tratamentoAtivo = true;
    private Menu menu;

    public Medicamento(String nome, int periodicidade, int quantidade, Paciente paciente, int periodoDeUso, Menu menu) {
        this.nome = nome;
        this.periodicidade = periodicidade;
        this.quantidade = quantidade;
        this.paciente = paciente;
        this.periodoDeUso = periodoDeUso;
        this.menu = menu;
    }

    public Medicamento(Medicamento original, Paciente novoPaciente, Menu menu) {
        this.nome = original.nome;
        this.periodicidade = original.periodicidade;
        this.quantidade = original.quantidade;
        this.periodoDeUso = original.periodoDeUso;
        this.paciente = novoPaciente;
        this.menu = menu;
    }

    public String getNome() { return nome; }
    public Paciente getPaciente() { return paciente; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int q) { this.quantidade = q; }

    private void usarDose() {
        if (this.quantidade > 0) {
            this.quantidade--;
            System.out.println("- " + paciente.getNome() + " tomou " + this.nome + ". (Restam: " + this.quantidade + ")");
        }
    }

    private void solicitarReabastecimento() {
        if (menu != null) {
            menu.sinalizarReabastecimento(this);
        }
        
        while (this.quantidade == 0 && this.tratamentoAtivo) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                this.tratamentoAtivo = false;
            }
        }
    }

    public void pararTratamento() {
        this.tratamentoAtivo = false;
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            this.tratamentoAtivo = false;
        }

        while (tratamentoAtivo) {
            if (quantidade > 0) {
                usarDose();
            }
            
            if (quantidade == 0) {
                System.out.println("\n" + this.nome + " para " + this.paciente.getNome() + " acabou.");
                solicitarReabastecimento();
                if(this.quantidade > 0) {
                    System.out.println("-> Tratamento com " + this.nome + " para " + this.paciente.getNome() + " foi retomado.");
                    continue;
                } else {
                    break;
                }
            }

            try {
                Thread.sleep(periodicidade * 1000);
            } catch (InterruptedException e) {
                this.tratamentoAtivo = false;
            }
        }
        System.out.println("-> Fim da medicação para " + nome + " de " + paciente.getNome() + ".");
    }
}
