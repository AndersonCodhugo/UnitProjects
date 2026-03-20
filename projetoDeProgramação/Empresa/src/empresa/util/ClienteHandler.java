package empresa.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClienteHandler {
    private String nomeCompleto;
    private int idadeCliente;
    private String emailValido;

    public ClienteHandler() {
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public boolean validarEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setIdadeCliente(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dataNascimento, formatter);
        LocalDate currentDate = LocalDate.now();
        this.idadeCliente = currentDate.getYear() - date.getYear();
    }
}
