package com.kamann.client.controller;

import com.kamann.client.dto.ClientDto;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientCreateService;
import com.kamann.client.service.ClientDeleteService;
import com.kamann.client.service.ClientGetService;
import com.kamann.client.service.ClientListService;
import com.kamann.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientGetService clientGetService;
    private final ClientListService clientListService;
    private final ClientCreateService clientCreateService;
    private final ClientDeleteService clientDeleteService;
    private final ClientRepository clientRepository;

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getClientById(@PathVariable Long id) throws ResourceNotFoundException {
        if (clientRepository.existsById(id)) {
            return new ResponseEntity<>(clientGetService.getClientById(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<ClientDto>> getClients() {
        return new ResponseEntity<>(clientListService.getClientsAsList(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto) {
        clientCreateService.execute(clientDto);
        return new ResponseEntity<>(clientDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteClient(@PathVariable Long id) {
        clientDeleteService.delete(id);
        return new ResponseEntity<>(id, HttpStatus.ACCEPTED);
    }
}
