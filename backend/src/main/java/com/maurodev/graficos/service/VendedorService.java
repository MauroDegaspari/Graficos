package com.maurodev.graficos.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maurodev.graficos.DTO.VendedorDTO;
import com.maurodev.graficos.model.VendedorModel;
import com.maurodev.graficos.repository.VendedorRepository;

@Service
public class VendedorService {
	
	//injetar de forma automatica
	@Autowired
	private VendedorRepository repo;
	
	
	public List<VendedorDTO> findAll(){
		List<VendedorModel> lista = repo.findAll();
				//convertendo Model em DTO em expressão LAMBDA
		return lista.stream().map(x -> new VendedorDTO(x)).collect(Collectors.toList()); 
	}
}
