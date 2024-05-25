package com.tlijani.avis_backend.services;


import com.tlijani.avis_backend.entities.Client;
import com.tlijani.avis_backend.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;


    public void creer(Client client){
       Client clientInDb =  this.clientRepository.findByEmail(client.getEmail());
       if (clientInDb ==null){
           this.clientRepository.save(client);

       }
    }
    public List<Client> getClients(){
        return this.clientRepository.findAll();

    }

    public Client getClientById(int id){
        Optional<Client>  optionalClient = this.clientRepository.findById(id);
            return optionalClient.orElseThrow(null);

    }



}
