package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banco_a")
public class BancoA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "bancoA", cascade = CascadeType.ALL)
    private List<ClienteA> clientesA;

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

    public List<ClienteA> getClientesA() {
        return clientesA;
    }

    public void setClientesA(List<ClienteA> clientesA) {
        this.clientesA = clientesA;
    }
}

