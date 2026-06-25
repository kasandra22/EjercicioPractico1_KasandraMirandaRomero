
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Controllers;
 
import ejercicioPractico.Kasandra.Domain.Categoria;
import ejercicioPractico.Kasandra.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listar(Model model) {
        model.addAttribute("categorias", categoriaService.getCategorias());
        return "categoria/listado";
    }

    @GetMapping("/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Categoria categoria) {
        categoriaService.save(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        Categoria categoria = new Categoria();
        categoria.setId(id);
        model.addAttribute("categoria", categoriaService.getCategoria(categoria));
        return "categoria/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }
}