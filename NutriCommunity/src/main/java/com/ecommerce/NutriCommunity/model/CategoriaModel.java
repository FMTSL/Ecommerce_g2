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
	private String nome_ong;
	
	@NotBlank
	@Size(max = 100)
	private String local_atuacao;
	
	@NotBlank
	@Size(max = 20)
	private String tipo;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_ong() {
		return nome_ong;
	}

	public void setNome_ong(String nome_ong) {
		this.nome_ong = nome_ong;
	}

	public String getLocal_atuacao() {
		return local_atuacao;
	}

	public void setLocal_atuacao(String local_atuacao) {
		this.local_atuacao = local_atuacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
