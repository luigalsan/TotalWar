package org.example.model;

import org.example.model.ejercito.Bestia;
import org.example.model.ejercito.Heroe;
import org.example.model.ejercito.raza.*;

import java.util.HashSet;
import java.util.Set;

public class Game {
    private int turno;
    private Set<Heroe> ejercitoBien = new HashSet<>();
    private Set<Bestia> ejercitoMal = new HashSet<>();

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

    public Set<Heroe> getEjercitoBien() {
        return ejercitoBien;
    }

    public void setEjercitoBien(Set<Heroe> ejercitoBien) {
        this.ejercitoBien = ejercitoBien;
    }

    public Set<Bestia> getEjercitoMal() {
        return ejercitoMal;
    }

    public void setEjercitoMal(Set<Bestia> ejercitoMal) {
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
