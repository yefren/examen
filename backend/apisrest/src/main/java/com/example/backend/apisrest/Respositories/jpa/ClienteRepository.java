package com.example.backend.apisrest.Respositories.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.apisrest.Entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
