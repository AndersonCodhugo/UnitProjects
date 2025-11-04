package com.firstapp.atividadeoito.model;

import java.time.LocalDate;

public class Reserva {
    private Long id;
    private String nome;
    private String sexo;
    private String email;
    private LocalDate dataChegada;
    private int numeroNoites;
    private int numeroHospedes;
    private String mensagem;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    public void setNumeroNoites(int numeroNoites) {
        this.numeroNoites = numeroNoites;
    }

    public int getNumeroHospedes() {
        return numeroHospedes;
    }

    public void setNumeroHospedes(int numeroHospedes) {
        this.numeroHospedes = numeroHospedes;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
