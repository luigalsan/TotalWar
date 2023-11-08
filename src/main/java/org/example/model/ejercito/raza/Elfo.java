package org.example.model.ejercito.raza;

import org.example.model.Personaje;
import org.example.model.ejercito.Heroe;

public class Elfo extends Heroe {


    public Elfo(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);

    }
    @Override
    public int tirarDado() {

        return super.tirarDado();
    }

    public int tirarDadoEspecial(){

        return this.tirarDado() + 10;
    }

    public String toString(){
        return "Elfo{" + super.toString();
    }
}
