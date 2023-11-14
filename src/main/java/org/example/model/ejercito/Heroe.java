package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;
import org.example.model.ejercito.raza.Orco;

public abstract class Heroe extends Personaje {


    public Heroe(String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
    }

    @Override
    public int atacar(Personaje personaje) {

        return setPotenciaOfensiva(Math.max(tirarDado(), tirarDado()));

    }
    @Override
    public int recibirDano(Personaje personaje, int potenciaOfensiva) {
        int danoRecibido = 0;
        if(personaje instanceof Orco){
            // Reducir Armadura
            int valorArmaduraReducida = getArmadura() - (int)(getArmadura()*0.10);
            if(potenciaOfensiva > getArmadura()){
                danoRecibido = potenciaOfensiva - valorArmaduraReducida;
                setVida(getVida() - danoRecibido);

                return danoRecibido;
            }else{
                return danoRecibido;
            }
        }else{
            if(potenciaOfensiva > getArmadura()){
                danoRecibido = potenciaOfensiva - getArmadura();
                setVida(getVida() - danoRecibido);
                return danoRecibido;
            }else{
                return danoRecibido;
            }

        }

    }
    private static int tirarDado(){

        Dado dado1 = new Dado();
        return dado1.lanzarDado(0,100);

    }

}

