package com.example.ws_MobileMoney.repositories;

import com.example.ws_MobileMoney.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
