package com.maurodev.graficos.DTO;

import com.maurodev.graficos.model.VendedorModel;

public class VendasPorVendedorDTO {

	private String nomeVendedor;
	private Long visitas;
	private Long negocios;
	
	public VendasPorVendedorDTO() {}

	public VendasPorVendedorDTO(VendedorModel vendedor, Long visitas, Long negocios) {
		super();
		this.nomeVendedor = vendedor.getNome();
		this.visitas = visitas;
		this.negocios = negocios;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Long getVisitas() {
		return visitas;
	}

	public void setVisitas(Long visitas) {
		this.visitas = visitas;
	}

	public Long getNegocios() {
		return negocios;
	}

	public void setNegocios(Long negocios) {
		this.negocios = negocios;
	}

	
}
