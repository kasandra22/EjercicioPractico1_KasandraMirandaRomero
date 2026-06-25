/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Service.impl;
import ejercicioPractico.Kasandra.Domain.Servicio;
import ejercicioPractico.Kasandra.Repository.ServicioRepository;
import ejercicioPractico.Kasandra.Service.ServicioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP
 */
@Service
public class ServicioServiceImpl implements ServicioService{
     @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> getServicios() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio getServicio(Servicio servicio) {
        return servicioRepository.findById(servicio.getId()).orElse(null);
    }

    @Override
    public void save(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void delete(Servicio servicio) {
        servicioRepository.delete(servicio);
    }
}
