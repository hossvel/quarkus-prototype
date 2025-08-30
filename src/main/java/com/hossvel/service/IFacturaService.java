package com.hossvel.service;

import com.hossvel.model.FacturaDTO;
import com.hossvel.model.FacturaEntity;

public interface IFacturaService {
    public FacturaEntity generarFactura(FacturaDTO facturaDTO);
}
