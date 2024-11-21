package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    private String documento;
    private String userName;
    private String password;

    @OneToOne
    @MapsId //?????
    @JoinColumn(name = "documento")
    private Cliente cliente;

    public Usuario(String documento, String userName, String password, Cliente cliente) {
        this.documento = documento;
        this.userName = userName;
        this.password = password;
        this.cliente = cliente;
    }

    public Usuario() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
