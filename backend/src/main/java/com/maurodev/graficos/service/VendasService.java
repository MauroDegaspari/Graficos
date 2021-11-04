package com.maurodev.graficos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maurodev.graficos.DTO.TotalVendasDTO;
import com.maurodev.graficos.DTO.VendasDTO;
import com.maurodev.graficos.DTO.VendasPorVendedorDTO;
import com.maurodev.graficos.model.VendasModel;
import com.maurodev.graficos.repository.VendasRepository;

@Service
public class VendasService{

	@Autowired
	private VendasRepository repo;
	
	
	public Page<VendasDTO> findAll(Pageable page){
		Page<VendasModel> lista = repo.findAll(page);
		
		return lista.map(x -> new VendasDTO(x));
	}
	@Transactional(readOnly = true)
	public List<TotalVendasDTO> totalGroupByVendedor(){
		return repo.totalGroupByVendedor();
	};
	
	public List<VendasPorVendedorDTO> vendasPorGroupByVendedor(){
		return repo.vendasPorGroupByVendedor();
	}
}
