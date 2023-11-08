package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Humano extends Heroe {
    public Humano(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int tirarDado(){

        return super.tirarDado();

    }

    public String toString(){
        return "Humano{" + super.toString();
    }
}
