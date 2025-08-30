package com.hossvel.factory;

import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaFactory {

    public IFacturaBuilder createFactory(String factureType) {
        return switch (factureType.toLowerCase()) {
            case "nacional" -> new FacturaNacionalBuilder();
            case "internacional" -> new FacturaInternacionalBuilder();
            default -> throw new IllegalArgumentException("Tipo de factura no válido");
        };

    }
}
