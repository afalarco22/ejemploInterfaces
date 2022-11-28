package org.example.clases;

import org.example.interfaces.Acciones;

public class Avanzado extends Programador implements Acciones {

    public Avanzado() {
    }

    @Override
    public void programar() {
        System.out.println("Soy un programador avanzado y estoy programando");

    }

    @Override
    public void renunciar() {

    }
}
