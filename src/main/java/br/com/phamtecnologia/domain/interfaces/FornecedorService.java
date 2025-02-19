package br.com.phamtecnologia.domain.interfaces;

import java.util.List;

import br.com.phamtecnologia.domain.entities.Fornecedor;

public interface FornecedorService {

	List<Fornecedor> findAll() throws Exception;
}
