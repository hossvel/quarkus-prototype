package com.hossvel.singleton;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped // Singleton en Quarkus
public class FacturaGeneratorSingleton {

    private final AtomicInteger contador = new AtomicInteger(1000); // empieza en 1000

    public int generarNumeroFactura() {
        return contador.incrementAndGet();

    }
    public LocalDate obtenerFechaActual() {
        return LocalDate.now();
    }
}