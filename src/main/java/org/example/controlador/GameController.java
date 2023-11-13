package org.example.controlador;


import org.example.model.Personaje;
import org.example.model.ejercito.Bestia;
import org.example.model.ejercito.Heroe;
import org.example.model.ejercito.raza.*;
import org.example.vista.VistaBatalla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GameController {

    private List<Personaje> ejercitoBien = new ArrayList<>();
    private List<Personaje> ejercitoMal = new ArrayList<>();

    public GameController(String ejercito){
        this.ejercitoBien = instanciarEjercitoBien();
        this.ejercitoMal = instanciarEjercitoMal();

    }
    public GameController(){

    }
    private List<Personaje> instanciarEjercitoBien() {
        List<Personaje> ejercitoBien = new LinkedList<>();

        // Creando heroes para prueba
        ejercitoBien.add(new Elfo("Légolas", 150, 30));
        ejercitoBien.add(new Hobbit("Frodo", 20, 10));
        ejercitoBien.add(new Humano("Aragorn", 150, 50));
        ejercitoBien.add(new Humano("Gandalf", 100, 60));
        ejercitoBien.add(new Humano("Boromir", 100, 60));
        return ejercitoBien;
    }

    private List<Personaje> instanciarEjercitoMal() {
        List<Personaje> ejercitoMal = new LinkedList<>();
        // Creando bestias para prueba
        ejercitoMal.add(new Orco("Lurtz", 200, 60));
        ejercitoMal.add(new Orco("Shagrat", 220, 50));
        ejercitoMal.add(new Trasgo("Uglúk", 120, 30));
        ejercitoMal.add(new Trasgo("Mauhúr", 100, 30));

        return ejercitoMal;
    }

    public static boolean condicionNombre(String input) {
        return input.matches("^[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñA-ZÁÉÍÓÚÜÑ]{2,}$");
    }

    public void menuSeleccion() {
        boolean opcionValidada = false;
        VistaBatalla.imprimirBanner();
        do {
            try {
                int opcion = VistaBatalla.mensajeMenu();
                switch (opcion) {

                    case 1 -> {
                        // Borrar datos ejercito
                        seleccionPersonaje();
                    }
                    case 2 -> {
                        if (ejercitoBien.isEmpty() || ejercitoMal.isEmpty()) {
                            VistaBatalla.mensajeEjercitosRequeridos();
                        } else {
                            preparacionBatalla();
                            opcionValidada = true;
                            boolean continuarPartida = false;
                            do {
                                String continuar = VistaBatalla.mensajeJugarDeNuevo();
                                if (continuar.equals("Si")) {
                                    continuarPartida = true;
                                    opcionValidada = false;
                                    borrarEjercitos();
                                }
                                else if (continuar.equals("No")){
                                    break;
                                }
                                else {
                                    VistaBatalla.mensajeDefault();
                                }
                            } while (!continuarPartida);
                        }
                    }
                    case 3 -> {
                        opcionValidada = true;
                    }
                    default -> VistaBatalla.mensajeDefault();
                }
            } catch (NumberFormatException e) {
                VistaBatalla.mensajeNumberException();
            }

        } while (!opcionValidada);
    }
    // Selección personaje

    public void seleccionPersonaje() {
        String continuarCreandoPersonaje = null;
        do {

            // Atributos para nuestros Personajes
            int faccion = 0;
            String nombre = null;
            int vida = 0;
            int armadura = 0;
            String raza = null;

            // Variables bandera para controlar el flujo

            boolean faccionValidada = false;
            boolean heroeValidado = false;
            boolean bestiaValidado = false;
            boolean nombreValidado = false;
            boolean vidaValidada = false;
            boolean armaduraValidada = false;
            boolean otroPersonajeValidado = false;


            while (!nombreValidado) {
                // Introduce nombre
                nombre = VistaBatalla.mensajeIntroduceNombre();
                nombreValidado = true;
                if (!condicionNombre(nombre)) {
                    VistaBatalla.mensajeIntroduceNombreError();
                    nombreValidado = false;
                }
            }

            do {
                try {

                    faccion = VistaBatalla.mensajeIntroduceFaccion();

                    switch (faccion) {
                        case 1 -> {
                            do {
                                try {

                                    int numeroHeroe = VistaBatalla.mensajeIntroduceRazaHeroe();
                                    switch (numeroHeroe) {
                                        case 1 -> {
                                            raza = "Elfo";
                                            heroeValidado = true;
                                        }
                                        case 2 -> {
                                            raza = "Hobbit";
                                            heroeValidado = true;
                                        }
                                        case 3 -> {
                                            raza = "Humano";
                                            heroeValidado = true;
                                        }
                                        default -> VistaBatalla.mensajeDefault();
                                    }
                                } catch (NumberFormatException e) {
                                    VistaBatalla.mensajeNumberException();
                                }
                                faccionValidada = true;
                            } while (!heroeValidado);

                        }
                        case 2 -> {
                            do {
                                try {
                                    int numeroBestia = VistaBatalla.mensajeIntroduceRazaBestia();
                                    switch (numeroBestia) {
                                        case 1 -> {
                                            raza = "Orco";
                                            bestiaValidado = true;
                                        }
                                        case 2 -> {
                                            raza = "Trasgo";
                                            bestiaValidado = true;
                                        }
                                        default -> VistaBatalla.mensajeDefault();
                                    }
                                    ;

                                } catch (NumberFormatException e) {
                                    VistaBatalla.mensajeNumberException();
                                }
                                faccionValidada = true;
                            } while (!bestiaValidado);

                        }
                        default -> VistaBatalla.mensajeDefault();
                    }
                } catch (NumberFormatException e) {
                    VistaBatalla.mensajeNumberException();
                }
            } while (!faccionValidada);

            do {
                try {
                    // La vida tiene que ser mayor que cero
                    vida = VistaBatalla.mensajeVida();
                    vidaValidada = true;
                    if (vida <= 0) {
                        VistaBatalla.mensajeValorMayorCero();
                        vidaValidada = false;
                    }

                } catch (NumberFormatException e) {
                    VistaBatalla.mensajeNumberException();
                }
            } while (!vidaValidada);


            do {
                try {
                    armadura = VistaBatalla.mensajeArmadura();
                    armaduraValidada = true;
                    if (armadura < 10 || armadura > 60) {
                        VistaBatalla.mensajeValorMayorCero();
                        armaduraValidada = false;
                    }
                } catch (NumberFormatException n) {
                    VistaBatalla.mensajeNumberException();
                }
            } while (!armaduraValidada);


            //Paso estos atributos para la creación de mi personaje y los agrego al Set Bestia o Heroe


            // Verificar que nombre no es null

            if (faccion == 1) {
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
                VistaBatalla.detalleEjercito("Heroes");
                ejercitoBien.forEach(System.out::println);

            } else {
                switch (raza) {
                    case "Orco" -> {
                        ejercitoMal.add(new Orco(nombre, vida, armadura));
                    }
                    case "Trasgo" -> {
                        ejercitoMal.add(new Trasgo(nombre, vida, armadura));
                    }
                }
                VistaBatalla.detalleEjercito("Bestias");
                ejercitoMal.forEach(System.out::println);

            }


            do {
                continuarCreandoPersonaje = VistaBatalla.mensajeIntroducirOtroPersonaje();
                if (continuarCreandoPersonaje.equals("Si") || continuarCreandoPersonaje.equals("No")) {
                    otroPersonajeValidado = true;
                } else {
                    VistaBatalla.mensajeDefault();
                }
            } while (!otroPersonajeValidado);

        } while (continuarCreandoPersonaje.equalsIgnoreCase("Si"));
    }

    // Comienzo partida

    public void preparacionBatalla() {
        boolean opcionValidada = false;
        boolean opcionOrdenarValidada = false;

        do {
            try {
                int opcion = VistaBatalla.preparacionBatalla();

                switch (opcion) {
                    case 1 -> {
                        try {
                            do {
                                int opcionOrdenar = VistaBatalla.ordenarEjercitos();
                                switch (opcionOrdenar) {
                                    case 1 -> {
                                        ordenarLista(ejercitoBien, opcionOrdenar);
                                        ordenarLista(ejercitoMal, opcionOrdenar);
                                        opcionOrdenarValidada = true;
                                    }
                                    case 2 -> {
                                        ordenarLista(ejercitoBien, opcionOrdenar);
                                        ordenarLista(ejercitoMal, opcionOrdenar);
                                        opcionOrdenarValidada = true;
                                    }
                                    case 3 -> {
                                        ordenarLista(ejercitoBien, opcionOrdenar);
                                        ordenarLista(ejercitoMal, opcionOrdenar);
                                        opcionOrdenarValidada = true;
                                    }
                                    default -> VistaBatalla.mensajeDefault();
                                }

                                VistaBatalla.detalleEjercito("Heroes");
                                ejercitoBien.forEach(System.out::println);
                                System.out.println();

                                VistaBatalla.detalleEjercito("Bestias");
                                ejercitoMal.forEach(System.out::println);
                                System.out.println();

                            } while (!opcionOrdenarValidada);

                        } catch (NumberFormatException e) {
                            VistaBatalla.mensajeNumberException();
                        }
                    }
                    case 2 -> {
                        batalla();
                        opcionValidada = true;
                    }
                    default -> VistaBatalla.mensajeDefault();
                }
            } catch (NumberFormatException e) {
                VistaBatalla.mensajeNumberException();
            }
        } while (!opcionValidada);

    }

    public void ordenarLista(List<Personaje> listaPersonajes, int opcion) {

        switch (opcion) {
            case 1 -> listaPersonajes.sort((h1, h2) -> h1.getNombre().compareTo(h2.getNombre()));
            case 2 -> listaPersonajes.sort((h1, h2) -> h2.getVida() - h1.getVida());
            case 3 -> listaPersonajes.sort((h1, h2) -> h2.getArmadura() - h1.getArmadura());
        }

        if (listaPersonajes instanceof Bestia) {
            ejercitoMal = listaPersonajes;
        }
        if (listaPersonajes instanceof Heroe) {
            ejercitoBien = listaPersonajes;
        }
    }

    public void borrarEjercitos(){
        this.ejercitoMal = new LinkedList<>();
        this.ejercitoBien = new LinkedList<>();
    }

    public static void controlarDuplicados(ArrayList<Personaje> lista, Personaje personaje) {
        if (!lista.contains(personaje)) {
            lista.add(personaje);
        }
    }

    public void batalla(){
        int turno = 1;
        while(!ejercitoMal.isEmpty() && !ejercitoBien.isEmpty()){
            // Variable local turno
            int sizeListaMenor = Math.min(ejercitoBien.size(), ejercitoMal.size());

            List<Personaje> personajesMuertosBien = new ArrayList<>();
            List<Personaje> personajesMuertosMal = new ArrayList<>();

            VistaBatalla.detalleEjercito("Heroes");
            ejercitoBien.forEach(System.out::println);
            System.out.println(ejercitoBien.size());
            System.out.println();

            VistaBatalla.detalleEjercito("Bestias");
            ejercitoMal.forEach(System.out::println);
            System.out.println(ejercitoMal.size());
            System.out.println();


            VistaBatalla.mensajeTurno(turno);
            //Cada turno habrá que comprobar qué lista es la menor
            for (int i = 0; i < sizeListaMenor; i++) {
                Heroe heroe = (Heroe) ejercitoBien.get(i);
                Bestia bestia = (Bestia) ejercitoMal.get(i);

                VistaBatalla.detallePersonajesInicioBatalla(heroe.getNombre(), bestia.getNombre(), heroe.getVida(), bestia.getVida(), heroe.getArmadura(), bestia.getArmadura());

                // Ataque de heroe a bestia
                heroe.atacar(bestia);
                int danoRecibidoBestia = bestia.recibirDano(heroe, heroe.getPotenciaOfensiva());
                VistaBatalla.detallePersonajeResultado(heroe.getNombre(), heroe.getPotenciaOfensiva(), danoRecibidoBestia, bestia.getNombre());

                // Ataque de bestia a heroe
                bestia.atacar(heroe);
                int danoRecibidoHeroe = heroe.recibirDano(bestia, bestia.getPotenciaOfensiva());
                VistaBatalla.detallePersonajeResultado(bestia.getNombre(), bestia.getPotenciaOfensiva(), danoRecibidoHeroe, heroe.getNombre());

                // Pasar al siguiente personaje y comprobar si está muerto


                if(bestia.getVida() <= 0){
                    personajesMuertosMal.add(bestia);
                }

                if(heroe.getVida() <= 0){
                    personajesMuertosBien.add(heroe);
                }
            }
            if(!personajesMuertosMal.isEmpty()){
                for(Personaje personaje : personajesMuertosMal){
                    VistaBatalla.detalleMuerte(personaje);
                }
            }

            if(!personajesMuertosBien.isEmpty()){
                for(Personaje personaje : personajesMuertosBien){
                    VistaBatalla.detalleMuerte(personaje);
                }
            }

            ejercitoMal.removeAll(personajesMuertosMal);
            ejercitoBien.removeAll(personajesMuertosBien);

            turno ++;
        }

        // Decisión final de la batalla
        if(ejercitoMal.isEmpty() && ejercitoBien.isEmpty()){
            VistaBatalla.empateHeroesBestias();
        } else {
            if (ejercitoMal.isEmpty()) {
                VistaBatalla.victoriaHeroes();

            } else if (ejercitoBien.isEmpty()) {
                VistaBatalla.victoriaBestias();
            }
        }

    }
}


