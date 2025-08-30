package com.hossvel.service;

import com.hossvel.model.FacturaDTO;
import com.hossvel.model.FacturaEntity;
import com.hossvel.prototype.FacturaPrototype;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService {

    @Inject
    FacturaPrototype facturaPrototype;

    @Override
    public FacturaEntity generarFactura(FacturaDTO facturaDTO) {
        FacturaEntity clon = facturaPrototype.getPlantilla().clone();
        clon.cliente = facturaDTO.cliente;
        clon.subtotal = facturaDTO.subtotal;
        clon.impuestos = facturaDTO.subtotal * 0.18;

        return clon;
    }
}
