/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Service.impl;

import ejercicioPractico.Kasandra.Domain.Reserva;
import ejercicioPractico.Kasandra.Repository.ReservaRepository;
import ejercicioPractico.Kasandra.Service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
public class ReservaServiceImpl implements ReservaService {
     @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> getReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva getReserva(Reserva reserva) {
        return reservaRepository.findById(reserva.getId()).orElse(null);
    }

    @Override
    public void save(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void delete(Reserva reserva) {
        reservaRepository.delete(reserva);
    }
}



   