package com.example.backend.apisrest.Respositories.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.apisrest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
