package br.com.phamtecnologia.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologia.domain.entities.Categoria;
import br.com.phamtecnologia.domain.interfaces.CategoriaService;
import br.com.phamtecnologia.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> findAll() throws Exception {
		return (List<Categoria>) categoriaRepository.findAll();
	}

}
