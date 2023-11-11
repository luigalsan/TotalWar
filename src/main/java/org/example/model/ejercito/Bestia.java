package org.example.model.ejercito;

import org.example.model.Personaje;

import java.util.Random;

public class Bestia extends Personaje {
    private Random dado = new Random();


    public Bestia(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }

    @Override
    public int atacar(Personaje personaje) {
        return 0;
    }

    @Override
    public int recibirDano(Personaje personaje) {
        return 0;
    }

    public Random getDado() {
        return dado;
    }

    @Override
    public int tirarDado() {
        return dado.nextInt(90);
    }



}
