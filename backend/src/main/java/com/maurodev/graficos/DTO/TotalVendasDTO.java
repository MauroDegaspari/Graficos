package com.maurodev.graficos.DTO;

import java.io.Serializable;

import com.maurodev.graficos.model.VendedorModel;

public class TotalVendasDTO  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nomeVendedor;
	private Double total;
	
	public TotalVendasDTO() {}

	public TotalVendasDTO(VendedorModel vendedor, Double total) {
		super();
		this.nomeVendedor = vendedor.getNome();
		this.total = total;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
