package br.com.phamtecnologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.domain.entities.Fornecedor;
import br.com.phamtecnologia.domain.interfaces.FornecedorService;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {
	
	@Autowired
	FornecedorService fornecedorService;

	@GetMapping
	public List<Fornecedor> getAll() {
		
		try {
			return fornecedorService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
