package com.firstapp.atividadeseis.controllers;

import com.firstapp.atividadeseis.model.Reserva;
import com.firstapp.atividadeseis.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel/reservas")
public class HotelController {

    @Autowired
    private ReservaRepository reservaRepository;

    @PostMapping
    public ResponseEntity<Reserva> receberReserva(@RequestBody Reserva reserva) {
        Reserva novaReserva = reservaRepository.save(reserva);
        return new ResponseEntity<>(novaReserva, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReservas(@RequestParam(required = false) String email) {
        if (email != null) {
            return new ResponseEntity<>(reservaRepository.findByEmail(email), HttpStatus.OK);
        }
        return new ResponseEntity<>(reservaRepository.findAll(), HttpStatus.OK);
    }
}
