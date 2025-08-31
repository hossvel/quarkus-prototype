package com.hossvel.builder;


import com.hossvel.model.FacturaEntity;

import java.time.LocalDate;

public class FacturaInternacionalBuilder implements IFacturaBuilder{


    private FacturaEntity factura;

    public void clonar(FacturaEntity facturaEntityBase){
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

    public void calcularNumeroFactura(int numero) {
        factura.setNumeroFactura(numero);
    }

    public void genereFechaEmision(){
        factura.setFechaEmision(LocalDate.now());
    }


    public FacturaEntity getFactura() {
        return factura;
    }

}
