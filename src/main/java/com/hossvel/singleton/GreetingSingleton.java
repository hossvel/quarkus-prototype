package com.hossvel.singleton;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class GreetingSingleton {

    private int contador = 0;

    public String saludar(String nombre) {
        contador++;
        return "Hola " + nombre + " (saludo #" + contador + ")";
    }
}

