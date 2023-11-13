package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Hobbit extends Heroe {


    public Hobbit(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {

        if(personaje instanceof Trasgo){
            return super.atacar(personaje) - 5;
        }else{
            return super.atacar(personaje);
        }

    }
    @Override
    public int recibirDano(Personaje personaje, int potenciaOfensiva) {
        return super.recibirDano(personaje, potenciaOfensiva);
    }

    @Override
    public String toString(){
        return "Hobbit{" + super.toString();
    }
}
