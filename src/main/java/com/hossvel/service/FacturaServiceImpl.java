package com.hossvel.service;

import com.hossvel.builder.FacturaDirector;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.factory.FacturaFactory;
import com.hossvel.model.FacturaDTO;
import com.hossvel.model.FacturaEntity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService {

    @Inject
    FacturaFactory facturaFactory;

    @Override
    public FacturaEntity generarFactura(FacturaDTO dto) {

        IFacturaBuilder builder = facturaFactory.createFactory(dto.tipo);
        FacturaDirector director = new FacturaDirector(builder);
        director.construirFactura(dto.cliente, dto.subtotal);
        //Factura factura = director.getFactura();
        //return facturaRepository.guardar(factura);
       return director.getFactura();
    }
}
