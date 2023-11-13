package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;

import java.util.Random;

public class Bestia extends Personaje {


    public Bestia(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {
        return setPotenciaOfensiva(tirarDado());
    }

    @Override
    public int recibirDano(Personaje personaje, int potenciaOfensiva) {
        int danoRecibido = 0;

        if(potenciaOfensiva > getArmadura()){
          danoRecibido = potenciaOfensiva - getArmadura();
          setVida(getVida() - danoRecibido);

          return danoRecibido;
        }else{
            return danoRecibido;
        }

    }

    public static int tirarDado() {
        Dado dado = new Dado();

        return dado.lanzarDado(0,90);
    }

}
