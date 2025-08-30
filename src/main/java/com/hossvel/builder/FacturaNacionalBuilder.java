package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;

public class FacturaNacionalBuilder implements IFacturaBuilder{

    private FacturaEntity factura = new FacturaEntity();



    public void construirCliente(String nombre) {
        factura.setCliente(nombre);
    }


    public void construirMoneda() {
        factura.setMoneda("PEN");
    }

    @Override
    public void calcularSubTotal(double subtotal) {
        factura.setSubtotal(subtotal);
    }

    public void calcularImpuestos() {
        factura.setImpuestos(factura.getSubtotal() * 0.18); // Exento de impuestos
    }

    public void calcularTotal(){

        factura.setTotal(factura.getSubtotal() + factura.getImpuestos());

    }


    public FacturaEntity getFactura() {
        return factura;
    }

}
