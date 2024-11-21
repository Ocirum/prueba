package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Entidad == Tabla en base de datos
@Table(name = "clientes") //Darle nombre especial a la tabla
public class Cliente {
    @Id //Va arriba de la llave primaria de la tabla
    @Column(name = "documento")
    private String documento;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "email", unique = true)
    private String correo;

    public Cliente(String documento, String nombre, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Cliente() { //Siempre un constructor vacio, por si se hacen consultas
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
