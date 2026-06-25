/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicioPractico.Kasandra.Service;

import ejercicioPractico.Kasandra.Domain.Reserva;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ReservaService {
    public List<Reserva> getReservas();

    public Reserva getReserva(Reserva reserva);

    public void save(Reserva reserva);

    public void delete(Reserva reserva);
}
