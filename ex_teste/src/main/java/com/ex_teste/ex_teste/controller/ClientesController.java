package com.ex_teste.ex_teste.controller;

import com.ex_teste.ex_teste.model.Clientes;
import com.ex_teste.ex_teste.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll();
    }

    @PostMapping
    public Clientes createClientes(@RequestBody Clientes clientes) {
        return clientesRepository.save(clientes);
    }
}
