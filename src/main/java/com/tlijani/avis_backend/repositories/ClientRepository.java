package com.tlijani.avis_backend.repositories;

import com.tlijani.avis_backend.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client , Integer> {

    Client findByEmail(String email);

}
