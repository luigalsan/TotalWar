package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;

import java.util.Random;

public class Bestia extends Personaje implements Dado {
    private Random dado = new Random();


    public Bestia(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);

    }

    public Random getDado() {
        return dado;
    }

    @Override
    public int tirarDado() {
        return dado.nextInt(90);
    }



}
