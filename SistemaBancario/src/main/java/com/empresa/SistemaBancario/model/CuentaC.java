package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cuenta_c")
public class CuentaC {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private double saldo;

 @ManyToOne
 @JoinColumn(name = "cliente_c_id")
 private ClienteC clienteC;

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

 public ClienteC getClienteC() {
     return clienteC;
 }

 public void setClienteC(ClienteC clienteC) {
     this.clienteC = clienteC;
 }
}

