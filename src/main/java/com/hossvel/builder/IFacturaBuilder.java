package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;

public interface IFacturaBuilder {
    void construirCliente(String nombre);
    void construirMoneda();
    void calcularTotal(double subtotal);
    void calcularImpuestos();
    FacturaEntity getFactura();
}

