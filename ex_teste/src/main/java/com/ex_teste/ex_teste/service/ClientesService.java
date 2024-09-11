package com.ex_teste.ex_teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ex_teste.ex_teste.model.Clientes;
import com.ex_teste.ex_teste.repository.ClientesRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    public Clientes getClientesById(Integer id) {
        Optional<Clientes> clientes = clientesRepository.findById(id);
        return clientes.orElse(null);
    }

    @Transactional
    public Clientes saveClientes(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    @Transactional
    public Clientes updateClientes(Integer id, Clientes updateClientes) {
        Optional<Clientes> existingClientes = clientesRepository.findById(id);
        if (existingClientes.isPresent()) {
            Clientes clientes = existingClientes.get();
            clientes.setNome(updateClientes.getNome());
            return clientesRepository.save(clientes);
        }
        return null;
    }
}
