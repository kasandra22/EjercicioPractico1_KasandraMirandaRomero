/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Controllers;
 
import ejercicioPractico.Kasandra.Domain.Servicio;
import ejercicioPractico.Kasandra.Service.CategoriaService;
import ejercicioPractico.Kasandra.Service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/servicio")
public class ServicioController {
 
    @Autowired
    private ServicioService servicioService;
 
    @Autowired
    private CategoriaService categoriaService;
 
    @GetMapping("/listado")
    public String listar(Model model) {
        model.addAttribute("servicios", servicioService.getServicios());
        return "servicio/listado";
    }
 
    @GetMapping("/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("categorias", categoriaService.getCategorias());
        return "servicio/formulario";
    }
 
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Servicio servicio) {
        servicioService.save(servicio);
        return "redirect:/servicio/listado";
    }
 
    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        Servicio servicio = new Servicio();
        servicio.setId(id);
        model.addAttribute("servicio", servicioService.getServicio(servicio));
        model.addAttribute("categorias", categoriaService.getCategorias());
        return "servicio/formulario";
    }
 
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        Servicio servicio = new Servicio();
        servicio.setId(id);
        servicioService.delete(servicio);
        return "redirect:/servicio/listado";
    }
}
 