package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;

import java.time.LocalDate;

public interface IFacturaBuilder {
    void clonar(FacturaEntity facturaEntityBase);

    void construirCliente(String nombre);
    void construirMoneda();
    void calcularSubTotal(double subtotal);
    void calcularTotal();
    void calcularImpuestos();
    void calcularNumeroFactura(int numero);
    void genereFechaEmision();

    FacturaEntity getFactura();
}

