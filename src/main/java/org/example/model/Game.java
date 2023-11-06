package org.example.model;

import org.example.model.ejercito.Bestia;
import org.example.model.ejercito.Heroe;
import org.example.model.ejercito.raza.*;

import java.util.*;

public class Game {
    private int turno;
    private List<Personaje> ejercitoBien = new LinkedList<>();
    private List<Personaje> ejercitoMal = new LinkedList<>();

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


    public void ordenarLista(List<Personaje> listaPersonajes, int opcion) {

        switch (opcion) {
            case 1 -> listaPersonajes.sort((h1, h2) -> h1.getNombre().compareTo(h2.getNombre()));
            case 2 -> listaPersonajes.sort((h1, h2) -> h2.getVida() - h1.getVida());
            case 3 -> listaPersonajes.sort((h1, h2) -> h2.getArmadura() - h1.getArmadura());
        }

        if(listaPersonajes instanceof Bestia){
            ejercitoMal = listaPersonajes;
        }
        if(listaPersonajes instanceof Heroe){
            ejercitoBien = listaPersonajes;
        }
    }

    public void batalla(List<Personaje> ejercitoBien, List<Personaje> ejercitoMal, String mensajeTurno){

        // Creando heroes para prueba
        ejercitoBien.add(new Elfo("Légolas", 10, 10));
        ejercitoBien.add(new Humano("Aragorn", 10, 50));
        ejercitoBien.add(new Humano("Gandalf", 30, 30));

        // Creando bestias para prueba
        ejercitoMal.add(new Orco("Lurtz", 20, 10));
        ejercitoMal.add(new Orco("Uglúk", 10, 30));



        int turno = 0;
        while(!ejercitoMal.isEmpty() && !ejercitoBien.isEmpty()){
            System.out.println(mensajeTurno);
            int sizeListaMenor = Math.min(ejercitoBien.size(), ejercitoMal.size());

            int valorDadoHeroe = 0;
            int valorDadoBestia = 0;

            Iterator<Personaje> iteradorEjercitoMal = ejercitoMal.iterator();
            Iterator<Personaje> iteradorEjercitoBien = ejercitoBien.iterator();

            //Cada turno habrá que comprobar qué lista es la menor
            for (int i = 0; i < sizeListaMenor; i++){
                Heroe heroe = (Heroe) ejercitoBien.get(i);
                Bestia bestia = (Bestia) ejercitoMal.get(i);

                // Obtener el valor de los dados
                if(heroe instanceof Elfo){
                    valorDadoHeroe = heroe.tirarDado();
                }
                if(bestia instanceof Orco){
                    valorDadoBestia = bestia.tirarDado();
                }

                System.out.println();

                // Comprobar armadura de cada personaje y en función de la puntuación de cada uno,
                // quitar vida o no
                if(valorDadoHeroe > bestia.getArmadura()){

                    bestia.setVida(bestia.getVida() - (valorDadoHeroe - bestia.getArmadura()));
                }
                if(valorDadoBestia > heroe.getArmadura()){
                    heroe.setVida(heroe.getVida() - (valorDadoBestia - heroe.getArmadura()));
                }
                turno ++;

            }

            while(iteradorEjercitoMal.hasNext()) {
                Personaje personaje = iteradorEjercitoMal.next();
                if(personaje.getVida() <= 0){
                    System.out.println("Ha muerto " + personaje.getNombre());
                    iteradorEjercitoMal.remove();
                }
            }

            while(iteradorEjercitoBien.hasNext()) {
                Personaje personaje = iteradorEjercitoBien.next();
                if(personaje.getVida() <= 0){
                    System.out.println("Ha muerto " + personaje.getNombre());
                    iteradorEjercitoBien.remove();
                }
            }

            if(ejercitoMal.isEmpty()){
                System.out.println("¡¡ VICTORIA DE LOS HÉROES !! ");

            }
            if(ejercitoBien.isEmpty()){
                System.out.println("¡¡ VICTORIA DE LAS BESTIAS !! ");

            }
        }
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public List<Personaje> getEjercitoBien() {
        return ejercitoBien;
    }

    public void setEjercitoBien(List<Personaje> ejercitoBien) {
        this.ejercitoBien = ejercitoBien;
    }

    public List<Personaje> getEjercitoMal() {
        return ejercitoMal;
    }

    public void setEjercitoMal(List<Personaje> ejercitoMal) {
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
