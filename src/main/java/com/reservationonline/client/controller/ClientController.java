package com.reservationonline.client.controller;

import com.reservationonline.client.domain.dto.ClientDto;
import com.reservationonline.client.domain.service.client.ClientAddService;
import com.reservationonline.client.domain.service.client.ClientDeleteService;
import com.reservationonline.client.domain.service.client.ClientGetByIdService;
import com.reservationonline.client.domain.service.client.ClientListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientGetByIdService getByIdService;
    private final ClientListService getAsListService;
    private final ClientAddService addService;
    private final ClientDeleteService deleteservice;

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getClientById(@PathVariable Long id) {
        if (getByIdService.existsById(id))
            return new ResponseEntity<>(getByIdService.getClientById(id), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<ClientDto>> getClientsAsList() {
        if (getAsListService.getClientsAsList().isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(getAsListService.getClientsAsList(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<ClientDto> addClient(@RequestBody ClientDto dto) {
        return new ResponseEntity<>(addService.add(dto), HttpStatus.CREATED);
    }
    //todo raw paswword cannot be null!!!

    @DeleteMapping("/{id}")
    public ResponseEntity<ClientDto> deleteClient(@PathVariable Long id) {
        if (deleteservice.deleteIfIdExists(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping
    public ResponseEntity<ClientDto> deleteAllClients() {
        if (deleteservice.clientListIsEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
