package com.tlijani.avis_backend.controllers;


import com.tlijani.avis_backend.entities.Client;
import com.tlijani.avis_backend.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "client")
public class ClientController {

    @Autowired
    ClientService clientService;



    @PostMapping
    public void creer(@RequestBody Client client){
        this.clientService.creer(client);

    }
    @GetMapping
    public ResponseEntity<List<Client>> getAllCustomers(){
        return ResponseEntity.ok(clientService.getClients());
    }
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }
}
