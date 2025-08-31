package com.hossvel.service;

import com.hossvel.builder.FacturaDirector;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.factory.FacturaFactory;
import com.hossvel.factory.FacturaPlantilla;
import com.hossvel.model.FacturaDTO;
import com.hossvel.model.FacturaEntity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService {

    @Inject
    FacturaFactory facturaFactory;

    @Inject
    private FacturaPlantilla facturaPlantilla;

    @Override
    public FacturaEntity generarFactura(FacturaDTO dto) {

        IFacturaBuilder builder = facturaFactory.createFactory(dto.tipo);
        FacturaEntity facturaEntityBase = facturaPlantilla.getPlantilla();

        FacturaDirector director = new FacturaDirector(builder);
        director.construirFactura(facturaEntityBase,dto.cliente, dto.subtotal);

        //Factura factura = director.getFactura();
        //return facturaRepository.guardar(factura);
       return director.getFactura();
    }
}
