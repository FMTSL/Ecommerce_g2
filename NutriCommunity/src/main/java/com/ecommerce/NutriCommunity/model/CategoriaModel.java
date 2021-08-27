package com.ecommerce.NutriCommunity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(max = 100)
	private String nomeOng;
	
	@NotBlank
	@Size(max = 100)
	private String localAtuacao;
	
	@NotBlank
	@Size(max = 20)
	private String tipo;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeOng() {
		return nomeOng;
	}

	public void setNomeOng(String nomeOng) {
		this.nomeOng = nomeOng;
	}

	public String getLocalAtuacao() {
		return localAtuacao;
	}

	public void setLocalAtuacao(String localAtuacao) {
		this.localAtuacao = localAtuacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
