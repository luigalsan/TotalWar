package org.example.model.ejercito;

import org.example.model.Dado;
import org.example.model.Personaje;

import java.util.Random;

public class Heroe extends Personaje implements Dado {

    public Random dado = new Random();


    public Heroe(String nombre, int ataque, int armadura) {
        super(nombre, ataque, armadura);
    }

    @Override
    public int tirarDado() {
        return dado.nextInt(100);
    }

    public int jugar(){
        int dadoUno = tirarDado();
        int dadoDos = tirarDado();

        if(dadoUno > dadoDos){
            return dadoUno;
        }else{
            return dadoDos;
        }
    }



}
