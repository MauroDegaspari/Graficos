package com.maurodev.graficos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodev.graficos.model.VendasModel;

public interface VendasRepository extends JpaRepository<VendasModel, Long> {

}
