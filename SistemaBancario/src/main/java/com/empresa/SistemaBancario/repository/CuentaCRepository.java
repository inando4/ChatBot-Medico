package com.empresa.SistemaBancario.repository;

import com.empresa.SistemaBancario.model.CuentaC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaCRepository extends JpaRepository<CuentaC, Long> {
}

