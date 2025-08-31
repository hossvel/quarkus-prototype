package com.hossvel.builder;


import com.hossvel.model.FacturaEntity;

public class FacturaInternacionalBuilder implements IFacturaBuilder{


    private FacturaEntity factura = new FacturaEntity();

    public FacturaInternacionalBuilder(FacturaEntity facturaEntityBase) {

        this.factura = facturaEntityBase.clone();
    }

    public void construirCliente(String nombre) {
        factura.setCliente(nombre);
    }


    public void construirMoneda() {

        factura.setMoneda("USD");
    }

    @Override
    public void calcularSubTotal(double subtotal) {

        factura.setSubtotal(subtotal);
    }

    public void calcularImpuestos() {
        factura.setImpuestos(0); // Exento de impuestos
    }

    public void calcularTotal(){

        factura.setTotal(factura.getSubtotal() + factura.getImpuestos());

    }

    public FacturaEntity getFactura() {
        return factura;
    }

}
