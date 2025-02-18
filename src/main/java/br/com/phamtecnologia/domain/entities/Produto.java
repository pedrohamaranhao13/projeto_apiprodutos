package br.com.phamtecnologia.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Data;

@Data
public class Produto {

	private UUID id;
	private String nome;
	private Integer quantidade;
	private String descricao;
	private BigDecimal preco;
	private Fornecedor fornecedor;
	private Categoria categoria;
}
