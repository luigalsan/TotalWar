package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Elfo extends Heroe {

    private int armadura;

    public Elfo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {

        if (personaje instanceof Orco) {
            return super.atacar(personaje) + 10;
        }else{
            return super.atacar(personaje);
        }
    }
    @Override
    public int recibirDano(Personaje personaje, int potenciaOfensiva){
        return super.recibirDano(personaje, potenciaOfensiva);
    }


    @Override
    public String toString(){
        return "Elfo{" + super.toString();
    }
}
