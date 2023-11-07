package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Elfo extends Heroe {


    public Elfo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }
    @Override
    public int tirarDado(Personaje personaje) {
        if(personaje instanceof Orco){

            return super.tirarDado(personaje) + 10;
        }
        return super.tirarDado(personaje);
    }
}
