package com.example.backend.apisrest.Services;


import org.springframework.stereotype.Service;

import com.example.backend.apisrest.Entities.Pedido;
import com.example.backend.apisrest.Respositories.jpa.PedidoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PedidoService {


    private PedidoRepository pedidoRepository;

    public Mono<Pedido> crearPedido(Pedido pedido) {
        pedido.setFechaCreacion(java.time.LocalDateTime.now().toString());
        return pedidoRepository.save(pedido);
    }

    public Mono<Pedido> obtenerPedido(Long id) {
        return pedidoRepository.findById(id);
    }

    public Flux<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Mono<Pedido> actualizarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Mono<Void> eliminarPedido(Long id) {
        return pedidoRepository.deleteById(id);
    }
}
