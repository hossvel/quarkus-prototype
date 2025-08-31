package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;

public interface IFacturaBuilder {
    // public void clonarPlantilla();

    void construirCliente(String nombre);
    void construirMoneda();
    void calcularSubTotal(double subtotal);
    void calcularTotal();
    void calcularImpuestos();

    FacturaEntity getFactura();
}

