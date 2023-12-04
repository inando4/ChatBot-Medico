package com.empresa.SistemaBancario.repository;

import com.empresa.SistemaBancario.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

