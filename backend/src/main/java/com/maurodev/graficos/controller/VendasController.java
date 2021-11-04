package com.maurodev.graficos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodev.graficos.DTO.TotalVendasDTO;
import com.maurodev.graficos.DTO.VendasDTO;
import com.maurodev.graficos.DTO.VendasPorVendedorDTO;
import com.maurodev.graficos.service.VendasService;

@RestController
@RequestMapping(value ="/vendas")
public class VendasController {

	@Autowired
	private VendasService service;
	
	@GetMapping
	public ResponseEntity<Page<VendasDTO>> findAll(Pageable page){
		Page<VendasDTO> lista = service.findAll(page);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value = "/total-vendas")
	public ResponseEntity<List<TotalVendasDTO>> totalGroupByVendedor(){
		List<TotalVendasDTO> lista = service.totalGroupByVendedor();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value = "/vendas-vendedo")
	public ResponseEntity<List<VendasPorVendedorDTO>> vendasPorGroupByVendedor(){
		List<VendasPorVendedorDTO> lista = service.vendasPorGroupByVendedor();
		return ResponseEntity.ok(lista);
	}
}
