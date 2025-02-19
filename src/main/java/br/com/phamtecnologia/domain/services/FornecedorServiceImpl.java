package br.com.phamtecnologia.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologia.domain.entities.Fornecedor;
import br.com.phamtecnologia.domain.interfaces.FornecedorService;
import br.com.phamtecnologia.repositories.FornecedorRepository;

@Service
public class FornecedorServiceImpl implements FornecedorService{

	@Autowired
	FornecedorRepository fornecedorRepository;
	
	@Override
	public List<Fornecedor> findAll() throws Exception {
		return (List<Fornecedor>) fornecedorRepository.findAll();
	}

}
