package org.example;

import org.example.controlador.GameController;
import org.example.model.ejercito.raza.Elfo;
import org.example.model.ejercito.raza.Humano;


public class Main {
    public static void main(String[] args) {

        //tengo una lista de 10 elementos
       GameController gameController = new GameController();

       gameController.menuSeleccion();
    }
}