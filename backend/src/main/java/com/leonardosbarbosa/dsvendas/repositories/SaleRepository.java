package com.leonardosbarbosa.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardosbarbosa.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
