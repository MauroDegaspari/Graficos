package com.maurodev.graficos.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import com.maurodev.graficos.model.VendasModel;
									// Serializable, garantir que os objetos Dto sejam convertido para BYTEs
public class VendasDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private int visitas;
	private int negocios;
	private Double quantidade;
	private LocalDate data;
	
	private VendedorDTO vendedo;
	
	public VendasDTO() {
		
	}

		public VendasDTO(Long id, int visitas, int negocios, Double quantidade, LocalDate data, VendedorDTO vendedo) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.negocios = negocios;
		this.quantidade = quantidade;
		this.data = data;
		this.vendedo = vendedo;
	}
		
		public VendasDTO(VendasModel model ) {
			
			id = model.getId();
			visitas = model.getVisitas();
			negocios = model.getNegocios();
			quantidade = model.getQuantidade();
			data = model.getData();
			vendedo =new VendedorDTO(model.getVendedor());
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

		public Double getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Double quantidade) {
			this.quantidade = quantidade;
		}

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public VendedorDTO getVendedo() {
			return vendedo;
		}

		public void setVendedo(VendedorDTO vendedo) {
			this.vendedo = vendedo;
		}
	
		
}
