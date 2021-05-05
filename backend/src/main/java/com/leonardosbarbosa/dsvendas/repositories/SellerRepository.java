package com.leonardosbarbosa.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardosbarbosa.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
