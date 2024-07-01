package com.example.backend.apisrest.Services;

import java.util.List;



import org.springframework.stereotype.Service;

import com.example.backend.apisrest.Entities.Cliente;
import com.example.backend.apisrest.Respositories.jpa.ClienteRepository;
@Service
public class ClienteService {
   private ClienteRepository clienteRepository;


    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public Cliente obtenerCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
