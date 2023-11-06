package org.example.model.ejercito.raza;

import org.example.model.ejercito.Heroe;

import java.util.Random;

public class Elfo extends Heroe {


    public Elfo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }
    @Override
    public int tirarDado() {
        return super.tirarDado() + 10;
    }
}
