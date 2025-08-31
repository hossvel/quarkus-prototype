package com.hossvel.factory;

import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.model.FacturaEntity;
import com.hossvel.prototype.FacturaPlantilla;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FacturaFactory {

    @Inject
    private FacturaPlantilla facturaPlantilla;

    public IFacturaBuilder createFactory(String factureType) {

        FacturaEntity facturaEntityBase = facturaPlantilla.getPlantilla();
        return switch (factureType.toLowerCase()) {
            case "nacional" -> new FacturaNacionalBuilder(facturaEntityBase);
            case "internacional" -> new FacturaInternacionalBuilder(facturaEntityBase);
            default -> throw new IllegalArgumentException("Tipo de factura no válido");
        };

    }
}
