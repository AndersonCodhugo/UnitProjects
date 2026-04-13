public class ProcessadorPagamento {

    public static void executar(Pagamento pagamento) {
        System.out.println("\nProcessando pagamento...");
        try {
            pagamento.processarPagamento();
            System.out.println("Sucesso: Pagamento efetuado corretamente.");

        } catch (IllegalArgumentException erroDeValor) {
            pagamento.setStatus("Erro: Valor inválido");
            System.out.println("Falha na validação: " + erroDeValor.getMessage());

        } catch (SaldoInsuficienteException erroDeSaldo) {
            pagamento.setStatus("Erro: Saldo/Limite insuficiente");
            System.out.println("Falha financeira: " + erroDeSaldo.getMessage());

        } catch (NullPointerException erroDeDados) {
            pagamento.setStatus("Erro: Dados inválidos");
            System.out.println("Falha nos dados: " + erroDeDados.getMessage());

        } catch (Exception e) {
            pagamento.setStatus("Erro: " + e.getMessage());
            System.out.println("Falha inesperada: " + e.getMessage());
        }
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException (String message) {
        super(message);
    }
}
