/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPractico.Kasandra.Service.impl;
import ejercicioPractico.Kasandra.Domain.Categoria;
import ejercicioPractico.Kasandra.Repository.CategoriaRepository;
import ejercicioPractico.Kasandra.Service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP
 */
@Service
public class CategoriaServiceimpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
        return categoriaRepository.findById(categoria.getId()).orElse(null);
    }

    @Override
    public void save(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }
    
}
