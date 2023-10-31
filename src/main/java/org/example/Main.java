package org.example;

import org.example.controlador.ControladorPartida;

public class Main {
    public static void main(String[] args) {
        ControladorPartida controller = new ControladorPartida();
        controller.seleccionPersonaje();
        controller.getPersonajes();
    }
}