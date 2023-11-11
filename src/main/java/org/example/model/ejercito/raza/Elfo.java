package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Elfo extends Heroe {


    public Elfo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }

    public int atacar(Personaje personaje) {

        if (personaje instanceof Orco) {
            return super.tirarDado() + 10;
        }else{
            return super.tirarDado();
        }

    }

    public String toString(){
        return "Elfo{" + super.toString();
    }
}
