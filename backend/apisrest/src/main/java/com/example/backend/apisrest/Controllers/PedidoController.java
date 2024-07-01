package com.example.backend.apisrest.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.apisrest.Entities.Pedido;
import com.example.backend.apisrest.Services.PedidoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Mono<Pedido> crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    @GetMapping("/{id}")
    public Mono<Pedido> obtenerPedido(@PathVariable Long id) {
        return pedidoService.obtenerPedido(id);
    }

    @GetMapping
    public Flux<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @PutMapping("/{id}")
    public Mono<Pedido> actualizarPedido(@RequestBody Pedido pedido) {
        return pedidoService.actualizarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> eliminarPedido(@PathVariable Long id) {
        return pedidoService.eliminarPedido(id);
    }

}
