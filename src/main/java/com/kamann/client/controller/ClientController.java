package com.kamann.client.controller;

import com.kamann.exception.ResourceNotFoundException;
import com.kamann.client.dto.ClientDto;
import com.kamann.client.repository.ClientRepository;
import com.kamann.client.service.ClientCreateService;
import com.kamann.client.service.ClientDeleteService;
import com.kamann.client.service.ClientGetService;
import com.kamann.client.service.ClientListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ClientController {

    private final ClientGetService clientGetService;
    private final ClientListService clientListService;
    private final ClientCreateService clientCreateService;
    private final ClientDeleteService clientDeleteService;
    private final ClientRepository clientRepository;

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getUserById(@PathVariable Long id) throws ResourceNotFoundException {
        if (clientRepository.existsById(id)) {
            return new ResponseEntity<>(clientGetService.getUserById(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClientDto>> getUsers() {
        return new ResponseEntity<>(clientListService.getUsersAsList(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<ClientDto> createUser(@RequestBody ClientDto clientDto) {
        clientCreateService.execute(clientDto);
        return new ResponseEntity<>(clientDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable Long id) {
        if (clientDeleteService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
