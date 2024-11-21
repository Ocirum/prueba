package com.dbproyecto10.dbproyecto10.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "creditos")
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementable
    private int codigo;

    @ManyToOne
    @JoinColumn(name = "documento_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_linea")
    private LineaCredito lineaCredito;

    private LocalDate fechaDeDesembolso; //Año-mes-día
    private Long monto;

    public Credito(int codigo, Cliente cliente, LineaCredito lineaCredito, LocalDate fechaDeDesembolso, Long monto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.lineaCredito = lineaCredito;
        this.fechaDeDesembolso = fechaDeDesembolso;
        this.monto = monto;
    }

    public Credito() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LineaCredito getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(LineaCredito lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public LocalDate getFechaDeDesembolso() {
        return fechaDeDesembolso;
    }

    public void setFechaDeDesembolso(LocalDate fechaDeDesembolso) {
        this.fechaDeDesembolso = fechaDeDesembolso;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }
}
