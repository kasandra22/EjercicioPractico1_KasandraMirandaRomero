/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HP
 */
@Controller
public class Inicializador {
    @GetMapping("/")
    public String mostrarInicio() {
        return "index";
    }

    @GetMapping("/contacto")
    public String mostrarContacto() {
        return "Contacto";
    }
}




    