package com.hossvel.model;

public class FacturaEntity implements Cloneable {
    public String empresa;
    public String cliente;
    public String moneda;
    public double subtotal;
    public double impuestos;

    @Override
    public FacturaEntity clone() {
        try {
            return (FacturaEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar factura", e);
        }
    }
}