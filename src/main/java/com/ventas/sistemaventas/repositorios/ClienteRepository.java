package com.ventas.sistemaventas.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ventas.sistemaventas.entidades.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}