package com.empresa.SistemaBancario.repository;

import com.empresa.SistemaBancario.model.CuentaB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaBRepository extends JpaRepository<CuentaB, Long> {
}

