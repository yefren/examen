package com.example.backend.apisrest.Respositories.jpa;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.backend.apisrest.Entities.Pedido;

public interface PedidoRepository extends ReactiveMongoRepository<Pedido,Long> {

}
