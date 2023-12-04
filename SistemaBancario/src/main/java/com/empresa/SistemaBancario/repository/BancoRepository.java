package com.empresa.SistemaBancario.repository;
import com.empresa.SistemaBancario.model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

