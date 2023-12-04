package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banco_b")
public class BancoB {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nombre;

 @OneToMany(mappedBy = "bancoB", cascade = CascadeType.ALL)
 private List<ClienteB> clientesB;

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

 public List<ClienteB> getClientesB() {
     return clientesB;
 }

 public void setClientesB(List<ClienteB> clientesB) {
     this.clientesB = clientesB;
 }
}

