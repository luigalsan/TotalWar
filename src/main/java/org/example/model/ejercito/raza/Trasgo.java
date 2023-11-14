package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Bestia;

public class Trasgo extends Bestia {

    public Trasgo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int atacar(Personaje personaje){
        return super.atacar(personaje);
    }
    @Override
    public int recibirDano(Personaje personaje, int potenciaOfensiva) {
        return super.recibirDano(personaje, potenciaOfensiva);
    }
    @Override
    public String toString(){
        return "Trasgo{" + super.toString();
    }

}
