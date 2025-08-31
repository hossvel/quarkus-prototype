package com.hossvel.factory;

import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.model.FacturaEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaFactory {

    public IFacturaBuilder createFactory(String factureType) {
        FacturaEntity facturaEntityBase = new FacturaEntity();
        return switch (factureType.toLowerCase()) {
            case "nacional" -> new FacturaNacionalBuilder(facturaEntityBase);
            case "internacional" -> new FacturaInternacionalBuilder(facturaEntityBase);
            default -> throw new IllegalArgumentException("Tipo de factura no válido");
        };

    }
}
