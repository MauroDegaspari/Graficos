package com.maurodev.graficos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maurodev.graficos.DTO.TotalVendasDTO;
import com.maurodev.graficos.DTO.VendasPorVendedorDTO;
import com.maurodev.graficos.model.VendasModel;

public interface VendasRepository extends JpaRepository<VendasModel, Long> {

	@Query("SELECT new com.maurodev.graficos.DTO.TotalVendasDTO(obj.vendedor, SUM(obj.quantidade)) "
		  +"FROM VendasModel AS obj GROUP BY obj.vendedor")
	List<TotalVendasDTO> totalGroupByVendedor();
	
	@Query("SELECT new com.maurodev.graficos.DTO.VendasPorVendedorDTO(obj.vendedor, SUM(obj.visitas), SUM(obj.negocios)) "
			  +"FROM VendasModel AS obj GROUP BY obj.vendedor")
		List<VendasPorVendedorDTO> vendasPorGroupByVendedor();
}
