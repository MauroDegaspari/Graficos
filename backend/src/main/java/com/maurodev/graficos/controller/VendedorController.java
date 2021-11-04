package com.maurodev.graficos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maurodev.graficos.DTO.VendedorDTO;
import com.maurodev.graficos.service.VendedorService;

@RestController
@RequestMapping(value="/vendedor")
public class VendedorController {

	@Autowired
	private VendedorService service;
	
	@GetMapping
	public ResponseEntity<List<VendedorDTO>> findAll(){
		List<VendedorDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
