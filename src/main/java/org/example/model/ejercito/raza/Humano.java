package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Humano extends Heroe {
    public Humano(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int tirarDado(Personaje personaje){

        return super.tirarDado(personaje);
    }
}
