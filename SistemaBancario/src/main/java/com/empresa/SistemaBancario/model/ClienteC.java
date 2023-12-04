package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente_c")
public class ClienteC {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nombre;

 @ManyToOne
 @JoinColumn(name = "banco_c_id")
 private BancoC bancoC;

 @OneToMany(mappedBy = "clienteC", cascade = CascadeType.ALL)
 private List<CuentaC> cuentasC;

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

 public BancoC getBancoC() {
     return bancoC;
 }

 public void setBancoC(BancoC bancoC) {
     this.bancoC = bancoC;
 }

 public List<CuentaC> getCuentasC() {
     return cuentasC;
 }

 public void setCuentasC(List<CuentaC> cuentasC) {
     this.cuentasC = cuentasC;
 }
}

