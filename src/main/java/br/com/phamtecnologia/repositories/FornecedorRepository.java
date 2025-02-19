package br.com.phamtecnologia.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phamtecnologia.domain.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID>{

}
