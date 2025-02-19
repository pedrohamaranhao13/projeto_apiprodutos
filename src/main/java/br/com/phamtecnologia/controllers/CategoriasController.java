package br.com.phamtecnologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.domain.entities.Categoria;
import br.com.phamtecnologia.domain.interfaces.CategoriaService;

@RestController
@RequestMapping(value = "/api/categorias")
public class CategoriasController {
	
	@Autowired
	CategoriaService categoriaService;

	@GetMapping
	public List<Categoria> getAll() {
		try {
			return categoriaService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
