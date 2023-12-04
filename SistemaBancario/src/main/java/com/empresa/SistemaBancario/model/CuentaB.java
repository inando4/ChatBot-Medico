package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cuenta_b")
public class CuentaB {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private double saldo;

 @ManyToOne
 @JoinColumn(name = "cliente_b_id")
 private ClienteB clienteB;

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

 public ClienteB getClienteB() {
     return clienteB;
 }

 public void setClienteB(ClienteB clienteB) {
     this.clienteB = clienteB;
 }
}

