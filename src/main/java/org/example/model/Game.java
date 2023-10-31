package org.example.model;

import org.example.model.ejercito.Bestia;
import org.example.model.ejercito.Heroe;
import org.example.model.ejercito.raza.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private int turno;
    private List<Heroe> ejercitoBien = new LinkedList<>();
    private List<Bestia> ejercitoMal = new LinkedList<>();

    // Creación de personajes

    public void crearPersonajeHeroe(String nombre, int vida, int armadura, String raza){
        switch (raza) {
            case "Elfos" -> {
                ejercitoBien.add(new Elfo(nombre, vida, armadura));
            }
            case "Enanos" -> {
                ejercitoBien.add(new Enano(nombre, vida, armadura));
            }
            case "Humanos" -> {
                ejercitoBien.add(new Humano(nombre, vida, armadura));
            }
        }
    }

    public void crearPersonajeBestia(String nombre, int vida, int armadura, String raza){

        switch (raza) {
            case "Orco" -> {
                ejercitoMal.add(new Orco(nombre, vida, armadura));
            }
            case "Trasgo" -> {
                ejercitoMal.add(new Trasgo(nombre, vida, armadura));
            }
            case "Uruk" -> {
                ejercitoMal.add(new Uruk(nombre, vida, armadura));
            }
        }
    }


    public <T extends Personaje> List<T> ordenarListaPersonajes(List<T> personajes, int opcion) {
        List<T> listaOrdenada = new LinkedList<>(personajes);

        switch (opcion) {
            case 1 -> Collections.sort(listaOrdenada, (h1, h2) -> h1.getNombre().compareTo(h2.getNombre()));
            case 2 -> Collections.sort(listaOrdenada, (h1, h2) -> h2.getVida() - h1.getVida());
            case 3 -> Collections.sort(listaOrdenada, (h1, h2) -> h2.getArmadura() - h1.getArmadura());
        }

        return listaOrdenada;
    }





    public List<Bestia> ordenarListaBestia(List<Bestia> bestia){
        return null;
    }

    public List<Heroe> getEjercitoBien() {
        return ejercitoBien;
    }

    public void setEjercitoBien(List<Heroe> ejercitoBien) {
        this.ejercitoBien = ejercitoBien;
    }

    public List<Bestia> getEjercitoMal() {
        return ejercitoMal;
    }

    public void setEjercitoMal(List<Bestia> ejercitoMal) {
        this.ejercitoMal = ejercitoMal;
    }



//    public void incharseAOstias(){
//        Bestia miBestia = new Bestia("Paco",100,20,"tusMuertos");
//
//        if (miBestia instanceof Bestia){
//            System.out.println("ahora si");
//        }
//
//    }


}
