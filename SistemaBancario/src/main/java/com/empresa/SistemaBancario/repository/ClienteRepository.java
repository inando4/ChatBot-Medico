package com.empresa.SistemaBancario.repository;

import com.empresa.SistemaBancario.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

