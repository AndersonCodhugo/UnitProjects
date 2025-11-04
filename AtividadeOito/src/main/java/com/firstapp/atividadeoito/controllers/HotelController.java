package com.firstapp.atividadeoito.controllers;

import com.firstapp.atividadeoito.dao.ReservaDAO;
import com.firstapp.atividadeoito.model.Reserva;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/hotel/reservas")
public class HotelController {

    @PostMapping
    public ResponseEntity<Reserva> criarReserva(@RequestBody Reserva reserva) {
        try (ReservaDAO reservaDAO = new ReservaDAO()) {
            reservaDAO.salvarReserva(reserva);
            return new ResponseEntity<>(reserva, HttpStatus.CREATED);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReservasPorEmail(@RequestParam String email) {
        try (ReservaDAO reservaDAO = new ReservaDAO()) {
            List<Reserva> reservas = reservaDAO.listarReservasPorEmail(email);
            return new ResponseEntity<>(reservas, HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
