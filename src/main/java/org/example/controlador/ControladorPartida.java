package org.example.controlador;


import org.example.model.Game;
import org.example.model.Personaje;
import org.example.vista.VistaBatalla;

import java.util.Scanner;

public class ControladorPartida {


    Scanner sc = new Scanner(System.in);
    Game game = new Game();

    public static boolean condicionNombre(String input) {
        return input.matches("^[A-Z][a-zA-Z ]{2,}$");
    }

    public void menuSeleccion(){
        boolean opcionValidada = false;
        VistaBatalla.imprimirBanner();
        do{
            try{
                    int opcion = VistaBatalla.mensajeMenu();
                    switch (opcion) {

                        case 1 -> {
                            // Borrar datos ejercito
                            seleccionPersonaje();
                        }
                        case 2 -> {
                            if(game.getEjercitoBien().isEmpty() || game.getEjercitoMal().isEmpty()){
                                System.out.println("***** ¡ ATENCIÓN ! *****" +
                                        "\nSe necesita crear un ejército de cada tipo para comenzar la batalla\n");
                            }else {
                                preparacionBatalla();
                                opcionValidada = true;
                                boolean continuarPartida = false;
                                do {
                                    String continuar =  VistaBatalla.mensajeJugarDeNuevo();
                                    if (continuar.equals("Si") || continuar.equals("No")) {
                                        continuarPartida = true;
                                        opcionValidada = false;
                                        game.borrarEjercitos();
                                    }else{
                                        System.out.println("Introduce un valor valido para continuar");
                                    }
                                }while(!continuarPartida);
                            }
                        }
                        case 3 -> {
                            System.out.println("Salir");
                            opcionValidada = true;
                        }
                        default -> System.out.println("Introduce formato número correcto");
                    }
                }catch (NumberFormatException e){
                    System.out.println("Opción introducida no válida");
                }

            }while (!opcionValidada);
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


            while(!nombreValidado){
                // Introduce nombre
                nombre = VistaBatalla.mensajeIntroduceNombre();
                nombreValidado = true;
                if(!condicionNombre(nombre)){
                    VistaBatalla.mensajeIntroduceNombreError();
                    nombreValidado = false;
                }
            }

            do {
                try{

                faccion = VistaBatalla.mensajeIntroduceFaccion();

                switch (faccion) {
                    case 1 -> {
                        do{
                            try{

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
                                    default -> System.out.println("Introduce una raza correcta");
                                }
                            }catch(NumberFormatException e){
                                System.out.println("Introduce un valor válido");
                            }
                            faccionValidada = true;
                        }while(!heroeValidado);

                    }
                    case 2 -> {
                        do{
                            try{
                                int numeroBestia = VistaBatalla.mensajeIntroduceRazaBestia();
                                switch (numeroBestia) {
                                    case 1 -> {
                                        raza = "Orco";
                                        bestiaValidado = true;
                                    }
                                    case 2 ->{
                                        raza = "Trasgo";
                                        bestiaValidado = true;
                                    }
                                    default -> System.out.println("Introduce una raza correcta");
                                };

                            }catch (NumberFormatException e){
                                System.out.println("Introduce un valor válido");
                            }
                            faccionValidada = true;
                        }while(!bestiaValidado);

                    }
                    default -> System.out.println("Introduce la facción correcta");
                }
                }catch(NumberFormatException e){
                    System.out.println("Introduce un valor válido");
                }
            }while(!faccionValidada);

            do {
                try {

                    vida = VistaBatalla.mensajeVida();
                    vidaValidada = true;

                } catch (NumberFormatException e) {
                    System.out.println("Introduce un valor válido");
                }
            }while(!vidaValidada);


            do{
                try{
                    armadura = VistaBatalla.mensajeArmadura();
                    armaduraValidada = true;
                }catch(NumberFormatException n){
                    System.out.println("Introduce un valor válido");
                }
            }while(!armaduraValidada);


            //Paso estos atributos para la creación de mi personaje y los agrego al Set Bestia o Heroe

            // Verificar que nombre no es null

            if (faccion == 1) {
                game.crearPersonajeHeroe(nombre, vida, armadura, raza);
                VistaBatalla.detalleEjercito("Heroes");
                game.getEjercitoBien().forEach(System.out::println);

            }
            else {
                game.crearPersonajeBestia(nombre, vida, armadura, raza);
                VistaBatalla.detalleEjercito("Bestias");
                game.getEjercitoMal().forEach(System.out::println);

            }


            do {
                continuarCreandoPersonaje = VistaBatalla.mensajeIntroducirOtroPersonaje();
                if (continuarCreandoPersonaje.equals("Si") || continuarCreandoPersonaje.equals("No")) {
                    otroPersonajeValidado = true;
                }else{
                    System.out.println("Introduce un valor valido para continuar");
                }
            }while(!otroPersonajeValidado);

        } while (continuarCreandoPersonaje.equalsIgnoreCase("Si"));
    }

    public void getPersonajes(){
        System.out.println("Tu ejercito de Héroes está conformado por: ");
        game.getEjercitoBien().forEach(heroe -> {
            System.out.println(heroe.toString());
        });
    }
    // Comienzo partida

    public void preparacionBatalla(){
        boolean opcionValidada = false;
        boolean opcionOrdenarValidada = false;

            do{
                try{
                    int opcion = VistaBatalla.preparacionBatalla();

                    switch (opcion){
                        case 1 -> {
                            try{
                                do{
                                    int opcionOrdenar = VistaBatalla.ordenarEjercitos();
                                    switch(opcionOrdenar){
                                        case 1 -> {
                                            game.ordenarLista(game.getEjercitoBien(), opcionOrdenar);
                                            game.ordenarLista(game.getEjercitoMal(), opcionOrdenar);
                                            opcionOrdenarValidada = true;
                                        }
                                        case 2 -> {
                                            game.ordenarLista(game.getEjercitoBien(), opcionOrdenar);
                                            game.ordenarLista(game.getEjercitoMal(), opcionOrdenar);
                                            opcionOrdenarValidada = true;
                                        }
                                        case 3 ->{
                                            game.ordenarLista(game.getEjercitoBien(), opcionOrdenar);
                                            game.ordenarLista(game.getEjercitoMal(), opcionOrdenar);
                                            opcionOrdenarValidada = true;
                                        }
                                        default -> System.out.println("Elija una opción correcta");
                                    }

                                    VistaBatalla.detalleEjercito("Heroes");
                                    game.getEjercitoBien().forEach(System.out::println);
                                    System.out.println();

                                    VistaBatalla.detalleEjercito("Bestias");
                                    game.getEjercitoMal().forEach(System.out::println);
                                    System.out.println();

                                }while(!opcionOrdenarValidada);

                            }catch(NumberFormatException e){
                                System.out.println("El formato introducido no es válido");
                            }
                        }
                        case 2 -> {
                            System.out.println("Empieza la batalla");
                            controladorBatalla();
                            opcionValidada = true;
                        }
                        default -> System.out.println("Elija una opción correcta");
                    }
                }catch(NumberFormatException e){
                    System.out.println("El formato introducido no es válido");
                }
            }while(!opcionValidada);

    }


    // COMENZANDO LA BATALLA

    public void controladorBatalla(){
        game.batalla();
    }


}
