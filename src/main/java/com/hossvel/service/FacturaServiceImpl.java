package com.hossvel.service;

import com.hossvel.builder.FacturaDirector;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.factory.FacturaFactory;
import com.hossvel.factory.FacturaPlantilla;
import com.hossvel.model.FacturaDTO;
import com.hossvel.model.FacturaEntity;

import com.hossvel.singleton.FacturaGeneratorSingleton;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturaServiceImpl implements IFacturaService {

    @Inject
    FacturaFactory facturaFactory;

    @Inject
    private FacturaPlantilla facturaPlantilla;

    @Inject
    FacturaGeneratorSingleton facturaGenerator;

    @Override
    public FacturaEntity generarFactura(FacturaDTO dto) {

        FacturaEntity facturaEntityBase = facturaPlantilla.getPlantilla();

        IFacturaBuilder builder = facturaFactory.createFactory(dto.tipo);

        FacturaDirector director = new FacturaDirector(builder);
        director.construirFactura(facturaEntityBase, dto.cliente, dto.subtotal,facturaGenerator.generarNumeroFactura());

        //Factura factura = director.getFactura();
        //return facturaRepository.guardar(factura);
       return director.getFactura();
    }
}
