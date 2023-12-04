package com.empresa.SistemaBancario.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente_a")
public class ClienteA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "banco_a_id")
    private BancoA bancoA;

    @OneToMany(mappedBy = "clienteA", cascade = CascadeType.ALL)
    private List<CuentaA> cuentasA;

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

    public BancoA getBancoA() {
        return bancoA;
    }

    public void setBancoA(BancoA bancoA) {
        this.bancoA = bancoA;
    }

    public List<CuentaA> getCuentasA() {
        return cuentasA;
    }

    public void setCuentasA(List<CuentaA> cuentasA) {
        this.cuentasA = cuentasA;
    }
}

