package com.hossvel.factory;

import com.hossvel.model.FacturaEntity;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturaPlantilla {
    private FacturaEntity plantilla;

    @PostConstruct
    void init() {
        plantilla = new FacturaEntity();
        plantilla.setEmpresa("EMPRESA - HOSSVELL SAC");
        plantilla.setCliente("Plantilla Cliente");
        plantilla.setMoneda("PEN");
        plantilla.setSubtotal(0);
        plantilla.setImpuestos(0.0);
        plantilla.setTotal(0);
    }

    public FacturaEntity getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(FacturaEntity plantilla) {
        this.plantilla = plantilla;
    }
}
