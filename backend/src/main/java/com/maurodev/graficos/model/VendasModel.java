package com.maurodev.graficos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_sales")
public class VendasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="visited")
	private int visitas;
	
	@Column(name="deals")
	private int negocios;
	
	@Column(name="amount")
	private int quantidade;
	
	@Column(name="date")
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name="seller_id", insertable = false, updatable = false)
	private VendedorModel vendedor;
	
	public VendasModel() {
		
	}

	public VendasModel(Long id, int visitas, int negocios, int quantidade, LocalDate data, VendedorModel vendedor) {
		this.id = id;
		this.visitas = visitas;
		this.negocios = negocios;
		this.quantidade = quantidade;
		this.data = data;
		this.vendedor = vendedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

	public int getNegocios() {
		return negocios;
	}

	public void setNegocios(int negocios) {
		this.negocios = negocios;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public VendedorModel getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorModel vendedor) {
		this.vendedor = vendedor;
	}
	
		
}
