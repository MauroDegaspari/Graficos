package com.maurodev.graficos.DTO;

import java.io.Serializable;

import com.maurodev.graficos.model.VendedorModel;
									// Serializable, garantir que os objetos Dto sejam convertido para BYTEs
public class VendedorDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	
	public VendedorDTO() {
		
	}

	public VendedorDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	

	public VendedorDTO(VendedorModel model) {
		id = model.getId();
		nome = model.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
