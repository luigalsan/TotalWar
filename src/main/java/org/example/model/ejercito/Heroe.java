package org.example.model.ejercito;

import org.example.model.Personaje;

import java.util.Random;

public abstract class Heroe extends Personaje {

    public Heroe(String nombre, int vida, int armadura, int potenciaOfensiva) {
        super(nombre, vida, armadura, potenciaOfensiva);
    }

    @Override
    public int atacar(Personaje personaje) {
        Random dado1 = new Random();
    }

    @Override
    public int recibirDano(Personaje personaje) {
        return 0;
    }
}
