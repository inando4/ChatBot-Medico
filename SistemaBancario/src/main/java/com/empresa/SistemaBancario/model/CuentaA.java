package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cuenta_a")
public class CuentaA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double saldo;

    @ManyToOne
    @JoinColumn(name = "cliente_a_id")
    private ClienteA clienteA;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClienteA getClienteA() {
        return clienteA;
    }

    public void setClienteA(ClienteA clienteA) {
        this.clienteA = clienteA;
    }
}

