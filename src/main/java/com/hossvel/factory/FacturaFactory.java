package com.hossvel.factory;

import com.hossvel.builder.FacturaInternacionalBuilder;
import com.hossvel.builder.FacturaNacionalBuilder;
import com.hossvel.builder.IFacturaBuilder;
import com.hossvel.model.FacturaEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

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
