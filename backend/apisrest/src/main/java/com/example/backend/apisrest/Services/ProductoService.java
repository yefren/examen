package com.example.backend.apisrest.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.apisrest.Entities.Producto;
import com.example.backend.apisrest.Respositories.jpa.ProductoRepository;

@Service
public class ProductoService {


    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto obtenerProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
