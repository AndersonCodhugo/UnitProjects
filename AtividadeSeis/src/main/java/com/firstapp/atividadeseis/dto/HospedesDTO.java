package com.firstapp.atividadeseis.dto;

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
    int numNoites;
    int numHospedes;
    String Mensagem;
}
