package org.example.model.ejercito.raza;

import org.example.model.ejercito.Heroe;

import java.util.Random;

public class Elfo extends Heroe {


    public Elfo(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);

    }
    @Override
    public int tirarDado() {
        return super.tirarDado() + 10;
    }
}
