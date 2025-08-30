package com.hossvel.builder;


import com.hossvel.model.FacturaEntity;

public class FacturaInternacionalBuilder implements IFacturaBuilder{
    private FacturaEntity factura = new FacturaEntity();

    public void construirCliente(String nombre) {
        factura.setCliente(nombre);
    }


    public void construirMoneda() {
        factura.setMoneda("USD");
    }


    public void calcularImpuestos() {
        factura.setImpuestos(0); // Exento de impuestos
    }

    public void calcularTotal(double subtotal){
        factura.setSubtotal(subtotal);

    }

    public FacturaEntity getFactura() {
        return factura;
    }

}
