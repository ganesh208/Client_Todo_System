package com.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}