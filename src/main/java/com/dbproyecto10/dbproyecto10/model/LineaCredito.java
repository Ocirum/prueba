package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lineas_creditos")
public class LineaCredito {
    @Id
    private int idLineaCredito;
    private String nombre;
    private Long monto;

    public LineaCredito(int idLineaCredito, String nombre, Long monto) {
        this.idLineaCredito = idLineaCredito;
        this.nombre = nombre;
        this.monto = monto;
    }

    public LineaCredito() {
    }

    public int getIdLineaCredito() {
        return idLineaCredito;
    }

    public void setIdLineaCredito(int idLineaCredito) {
        this.idLineaCredito = idLineaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }
}
