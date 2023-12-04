package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banco_c")
public class BancoC {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nombre;

 @OneToMany(mappedBy = "bancoC", cascade = CascadeType.ALL)
 private List<ClienteC> clientesC;

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

 public List<ClienteC> getClientesC() {
     return clientesC;
 }

 public void setClientesC(List<ClienteC> clientesC) {
     this.clientesC = clientesC;
 }
}

