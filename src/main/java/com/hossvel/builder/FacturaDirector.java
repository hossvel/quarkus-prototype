package com.hossvel.builder;

import com.hossvel.model.FacturaEntity;
import com.hossvel.singleton.FacturaGeneratorSingleton;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


public class FacturaDirector {
    private IFacturaBuilder iFacturaBuilder;


    public FacturaDirector(IFacturaBuilder iFacturaBuilder) {
        this.iFacturaBuilder = iFacturaBuilder;
    }

    public void construirFactura(FacturaEntity facturaEntityBase,String cliente, double subtotal, int numfactura) {
        iFacturaBuilder.clonar(facturaEntityBase);
        iFacturaBuilder.construirCliente(cliente);
        iFacturaBuilder.calcularSubTotal(subtotal);
        iFacturaBuilder.construirMoneda();
        iFacturaBuilder.calcularImpuestos();
        iFacturaBuilder.calcularTotal();
        iFacturaBuilder.calcularNumeroFactura(numfactura);
        iFacturaBuilder.genereFechaEmision();
    }

    public FacturaEntity getFactura() {
        return iFacturaBuilder.getFactura();
    }
}
