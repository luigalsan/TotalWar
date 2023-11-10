package org.example.model;

import org.example.model.ejercito.Bestia;
import org.example.model.ejercito.Heroe;
import org.example.model.ejercito.raza.*;
import org.example.vista.VistaBatalla;

import java.util.*;

public class Game {
    private int turno;
    private List<Personaje> ejercitoBien = new LinkedList<>();
    private List<Personaje> ejercitoMal = new LinkedList<>();

    // Creación de personajes

    public void crearPersonajeHeroe(String nombre, int vida, int armadura, String raza){
        switch (raza) {
            case "Elfo" -> {
                ejercitoBien.add(new Elfo(nombre, vida, armadura));
            }
            case "Hobbit" -> {
                ejercitoBien.add(new Hobbit(nombre, vida, armadura));
            }
            case "Humano" -> {
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

    public void batalla(){

//        List<Personaje> ejercitoBien = new LinkedList<>();
//        List<Personaje> ejercitoMal = new LinkedList<>();
//
//
//        // Creando heroes para prueba
//        ejercitoBien.add(new Elfo("Légolas", 150, 30));
//        ejercitoBien.add(new Humano("Frodo", 20, 10));
//        ejercitoBien.add(new Humano("Aragorn", 150, 50));
//        ejercitoBien.add(new Humano("Gandalf", 100, 60));
//        ejercitoBien.add(new Humano("Boromir", 100, 60));
//
//
//        // Creando bestias para prueba
//        ejercitoMal.add(new Orco("Lurtz", 200, 60));
//        ejercitoMal.add(new Orco("Shagrat", 220, 50));
//        ejercitoMal.add(new Trasgo("Uglúk", 120, 30));
//        ejercitoMal.add(new Trasgo("Mauhúr", 100, 30));



        int turno = 1;
        while(!ejercitoMal.isEmpty() && !ejercitoBien.isEmpty()){

            int sizeListaMenor = Math.min(ejercitoBien.size(), ejercitoMal.size());

            int valorDadoHeroe = 0;
            int valorDadoBestia = 0;

            Iterator<Personaje> iteradorEjercitoMal = ejercitoMal.iterator();
            Iterator<Personaje> iteradorEjercitoBien = ejercitoBien.iterator();
            VistaBatalla.mensajeTurno(turno);
            //Cada turno habrá que comprobar qué lista es la menor
            for (int i = 0; i < sizeListaMenor; i++){
                Heroe heroe = (Heroe) ejercitoBien.get(i);
                Bestia bestia = (Bestia) ejercitoMal.get(i);

                VistaBatalla.detallePersonajesInicioBatalla(heroe.getNombre(), bestia.getNombre(), heroe.getVida(), bestia.getVida(), heroe.getArmadura(), bestia.getArmadura() );

                // Obtener el valor de los dados en Héroes
                if(heroe instanceof Elfo){
                    if(bestia instanceof Orco){
                        valorDadoHeroe = Math.max(((Elfo) heroe).tirarDadoEspecial(), ((Elfo) heroe).tirarDadoEspecial()); // Dado daño adicional orco
                    }else{
                        valorDadoHeroe = Math.max(heroe.tirarDado(), heroe.tirarDado()); // Tiran dos veces
                    }
                }
                if(heroe instanceof Humano){
                    valorDadoHeroe = Math.max(heroe.tirarDado(), heroe.tirarDado()); // Tira dos veces
                }
                if(heroe instanceof Hobbit){
                    if(bestia instanceof Trasgo){
                        valorDadoHeroe = Math.max(((Hobbit) heroe).tirarDadoEspecial(), ((Hobbit) heroe).tirarDadoEspecial()); // Tira dos veces
                    }else{
                        valorDadoHeroe = Math.max(heroe.tirarDado(), heroe.tirarDado()); // Tira dos veces
                    }
                }

                // Obtener el valor de los dados en Orco
                if(bestia instanceof Orco){
                    valorDadoBestia = bestia.tirarDado();
                }

                else if(bestia instanceof Trasgo){
                    valorDadoBestia = bestia.tirarDado();
                }

                // Comprobar armadura de cada personaje y en función de la puntuación de cada uno,
                // hacer daño o no


                int danoHeroe = valorDadoHeroe - bestia.getArmadura();
                bestia.setVida(bestia.getVida() - danoHeroe);

                VistaBatalla.detallePersonajeResultado(heroe.getNombre(), valorDadoHeroe, Math.max(danoHeroe, 0), bestia.getNombre());

                if(bestia instanceof Orco){

                    int reduccionArmaduraHeroe = (heroe.getArmadura() - (int)(heroe.getArmadura() * 0.10));
                    int danoBestia = valorDadoBestia - reduccionArmaduraHeroe;
                    heroe.setVida(heroe.getVida() - danoBestia);
                    VistaBatalla.detallePersonajeResultado(bestia.getNombre(), valorDadoBestia, Math.max(danoBestia, 0), heroe.getNombre());


                }else{
                    int danoBestia = valorDadoBestia - heroe.getArmadura();
                    heroe.setVida(heroe.getVida() - danoBestia);

                    VistaBatalla.detallePersonajeResultado(bestia.getNombre(), valorDadoBestia, Math.max(danoBestia, 0), heroe.getNombre());


                }

            }

            while(iteradorEjercitoMal.hasNext()) {
                Personaje personaje = iteradorEjercitoMal.next();
                if(personaje.getVida() <= 0){
                    VistaBatalla.detalleMuerte(personaje.getNombre());
                    iteradorEjercitoMal.remove();
                }
            }

            while(iteradorEjercitoBien.hasNext()) {
                Personaje personaje = iteradorEjercitoBien.next();
                if(personaje.getVida() <= 0){
                    VistaBatalla.detalleMuerte(personaje.getNombre());
                    iteradorEjercitoBien.remove();
                }
            }

            // Lógica para comprobar Victoria o empate

            if(ejercitoMal.isEmpty() && ejercitoBien.isEmpty()){
                VistaBatalla.empateHeroesBestias();
            }
            else if(ejercitoMal.isEmpty()){
                VistaBatalla.victoriaHeroes();
            }
            else if(ejercitoBien.isEmpty()){
                VistaBatalla.victoriaBestias();
            }

            turno ++;
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

    public void borrarEjercitos(){
        this.ejercitoMal = new LinkedList<>();
        this.ejercitoBien = new LinkedList<>();
    }

}
