package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente_b")
public class ClienteB {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nombre;

 @ManyToOne
 @JoinColumn(name = "banco_b_id")
 private BancoB bancoB;

 @OneToMany(mappedBy = "clienteB", cascade = CascadeType.ALL)
 private List<CuentaB> cuentasB;

 // Getters y setters

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public BancoB getBancoB() {
     return bancoB;
 }

 public void setBancoB(BancoB bancoB) {
     this.bancoB = bancoB;
 }

 public List<CuentaB> getCuentasB() {
     return cuentasB;
 }

 public void setCuentasB(List<CuentaB> cuentasB) {
     this.cuentasB = cuentasB;
 }
}

