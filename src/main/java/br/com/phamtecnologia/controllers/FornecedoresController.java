package br.com.phamtecnologia.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.domain.entities.Fornecedor;
import br.com.phamtecnologia.domain.interfaces.FornecedorService;
import br.com.phamtecnologia.dtos.FornecedorGetDto;

@RestController
@RequestMapping(value = "/api/fornecedores")
public class FornecedoresController {
	
	@Autowired
	FornecedorService fornecedorService;
	
	@Autowired
	ModelMapper modelMapper;

	@GetMapping
	public List<FornecedorGetDto> getAll() {
		
		try {
			List<Fornecedor> fornecedores = fornecedorService.findAll();
			
			List<FornecedorGetDto> result = modelMapper.map(fornecedores, 
					new TypeToken<List<FornecedorGetDto>>() {}.getType());
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
