package com.firstapp.atividadeseis.controllers;

import com.firstapp.atividadeseis.dto.HospedesDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotel/reservas")
public class HotelController {

    private static final List<HospedesDTO> reservas = new ArrayList<>();

    @PostMapping
    public ResponseEntity<HospedesDTO> receberReserva(@RequestBody HospedesDTO reserva) {
        reservas.add(reserva);
        return new ResponseEntity<>(reserva, HttpStatus.CREATED);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<HospedesDTO> verReserva(@PathVariable String nome) {
        for (HospedesDTO reserva : reservas) {
            if (reserva.getNome().equalsIgnoreCase(nome)) {
                return new ResponseEntity<>(reserva, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<HospedesDTO>> listarReservas() {
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }
}
