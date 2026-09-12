package com.saviobandeira.customerapi.services;

import com.saviobandeira.customerapi.repositories.ClientRepository;
import com.saviobandeira.customerapi.dto.ClientDTO;
import com.saviobandeira.customerapi.entities.Client;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clients = repository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto) {
        Client client = new Client(
                dto.getId(),
                dto.getName(),
                dto.getCpf(),
                dto.getIncome(),
                dto.getBirthDate(),
                dto.getChildren()
        );
        client = repository.save(client);
        return new ClientDTO(client);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {
        Client ref = repository.getReferenceById(id);

        ref.setName(dto.getName());
        ref.setCpf(dto.getCpf());
        ref.setIncome(dto.getIncome());
        ref.setBirthDate(dto.getBirthDate());
        ref.setChildren(dto.getChildren());

        ref = repository.save(ref);
        return new ClientDTO(ref);
    }
}
