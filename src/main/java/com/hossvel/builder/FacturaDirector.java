package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;

public class FacturaDirector {
    private IFacturaBuilder iFacturaBuilder;

    public FacturaDirector(IFacturaBuilder iFacturaBuilder) {
        this.iFacturaBuilder = iFacturaBuilder;
    }

    public void construirFactura(FacturaEntity facturaEntityBase,String cliente, double subtotal) {
        iFacturaBuilder.clonar(facturaEntityBase);
        iFacturaBuilder.construirCliente(cliente);
        iFacturaBuilder.calcularSubTotal(subtotal);
        iFacturaBuilder.construirMoneda();
        iFacturaBuilder.calcularImpuestos();
        iFacturaBuilder.calcularTotal();
    }

    public FacturaEntity getFactura() {
        return iFacturaBuilder.getFactura();
    }
}
