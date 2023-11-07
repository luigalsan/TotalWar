package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Hobbit extends Heroe {
    public Hobbit(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);
    }

    @Override
    public int tirarDado(Personaje personaje) {
        if(personaje instanceof Trasgo){

            return super.tirarDado(personaje) - 5;
        }
        return super.tirarDado(personaje);
    }
}
