package br.com.phamtecnologia.domain.interfaces;

import java.util.List;

import br.com.phamtecnologia.domain.entities.Categoria;

public interface CategoriaService {

	List<Categoria> findAll() throws Exception;
}
