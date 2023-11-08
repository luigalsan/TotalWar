package org.example;

import org.example.controlador.ControladorPartida;
import org.example.model.Game;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        ControladorPartida controlador = new ControladorPartida();

        controlador.seleccionPersonaje();



    }
}