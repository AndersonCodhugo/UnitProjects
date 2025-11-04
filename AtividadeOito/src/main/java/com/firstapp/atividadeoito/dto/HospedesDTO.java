package com.firstapp.atividadeoito.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class HospedesDTO {
    String nome;
    String sexo;
    String email;
    LocalDate dataChegada;
    String numNoites;
    String numHospedes;
    String Mensagem;
}
