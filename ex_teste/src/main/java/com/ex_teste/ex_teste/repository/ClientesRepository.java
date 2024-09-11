package com.ex_teste.ex_teste.repository;

import com.ex_teste.ex_teste.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends
        JpaRepository<Clientes, Integer> {
}
