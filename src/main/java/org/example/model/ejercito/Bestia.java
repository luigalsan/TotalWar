package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;

import java.util.Random;

public class Bestia extends Personaje implements Dado {
    private Random dado = new Random();


    public Bestia(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }

    public Random getDado() {
        return dado;
    }

    @Override
    public int tirarDado(Personaje personaje) {
        return dado.nextInt(90);
    }



}
