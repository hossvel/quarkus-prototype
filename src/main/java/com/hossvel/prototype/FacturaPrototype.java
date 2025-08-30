package com.hossvel.prototype;

import com.hossvel.model.FacturaEntity;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaPrototype {
    private FacturaEntity plantilla;

    @PostConstruct
    void init() {
        plantilla = new FacturaEntity();
        plantilla.empresa = "EMPRESA - HOSSVELL SAC";
        plantilla.cliente = "Plantilla Cliente";
        plantilla.moneda = "PEN";
        plantilla.subtotal = 0;
        plantilla.impuestos = 0.0;
    }

    public FacturaEntity getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(FacturaEntity plantilla) {
        this.plantilla = plantilla;
    }
}
