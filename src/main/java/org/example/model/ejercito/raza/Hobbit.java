package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Hobbit extends Heroe {
    public Hobbit(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);
    }



    public int atacar(){
        return super.tirarDado() - 5;
    }

    public String toString(){
        return "Hobbit{" + super.toString();
    }
}
