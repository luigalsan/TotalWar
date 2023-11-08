package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Bestia;

public class Orco extends Bestia {
    public Orco(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int tirarDado() {
        return super.tirarDado();
    }

    public String toString(){
        return "Orco{" + super.toString();
    }
}
