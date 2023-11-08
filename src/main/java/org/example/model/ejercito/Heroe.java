package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;

import java.util.Random;

public abstract class Heroe extends Personaje implements Dado {
    public Random dado = new Random();

    public Heroe(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);
    }

    @Override
    public int tirarDado() {
        return dado.nextInt(100);
    }


}
