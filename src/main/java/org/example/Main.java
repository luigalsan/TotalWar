package org.example;

import org.example.controlador.ControladorPartida;
import org.example.model.Game;
import org.example.model.Personaje;
import org.example.model.ejercito.raza.Elfo;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ControladorPartida controladorPartida = new ControladorPartida();
        //Menú selección
        controladorPartida.controladorBatalla();

    }
}