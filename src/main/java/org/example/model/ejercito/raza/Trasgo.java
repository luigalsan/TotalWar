package org.example.model.ejercito.raza;

import org.example.model.ejercito.Bestia;

public class Trasgo extends Bestia {
    public Trasgo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    private int atacar(){
        return super.tirarDado();
    }
    public String toString(){
        return "Trasgo{" + super.toString();
    }

}
