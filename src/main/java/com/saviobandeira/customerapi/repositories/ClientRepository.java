package com.saviobandeira.customerapi.repositories;

import com.saviobandeira.customerapi.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
