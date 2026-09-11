package com.saviobandeira.customerapi.services;

import com.saviobandeira.customerapi.repositories.ClientRepository;
import com.saviobandeira.customerapi.dto.ClientDTO;
import com.saviobandeira.customerapi.entities.Client;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(
                client.getId(),
                client.getName(),
                client.getCpf(),
                client.getIncome(),
                client.getBirthDate(),
                client.getChildren()
        );
        return dto;
    }
}
