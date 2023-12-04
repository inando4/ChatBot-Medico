package com.empresa.SistemaBancario.repository;

import com.empresa.SistemaBancario.model.BancoB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoBRepository extends JpaRepository<BancoB, Long> {
}

