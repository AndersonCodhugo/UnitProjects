public class HistoricoNavegador {
    NoHistorico cabeca;
    NoHistorico paginaAtual;

    public void buscar(String endereco, String nome) {
        NoHistorico novoSite = new NoHistorico(endereco, nome);

        if (cabeca == null) {
            cabeca = novoSite;
            paginaAtual = novoSite;
        } else {
            novoSite.anterior = paginaAtual;
            paginaAtual.proximo = novoSite;

            paginaAtual = novoSite;

        }
        System.out.println("-> Acessando: " + nome + " (" + endereco + ")");
    }

    public void voltar() {
        if (paginaAtual != null && paginaAtual.anterior != null) {
            paginaAtual = paginaAtual.anterior;
            System.out.println("<- Voltou para: " + paginaAtual.nome);
        } else {
            System.out.println("Não é possível voltar. Você está na primeira página.");
        }
    }

    public void avancar() {
        if (paginaAtual != null && paginaAtual.proximo != null) {
            paginaAtual = paginaAtual.proximo;
            System.out.println("-> Avançou para: " + paginaAtual.nome);
        } else {
            System.out.println("Não há páginas à frente para avançar.");
        }
    }

    public void exibirAtual() {
        if(paginaAtual != null) {
            System.out.println("\n[ PÁGINA ATUAL: " + paginaAtual.nome + " ]\n");
        }
    }
}
