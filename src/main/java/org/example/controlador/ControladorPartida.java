package org.example.controlador;


import org.example.model.Game;
import org.example.vista.VistaBatalla;

import java.util.Scanner;

public class ControladorPartida {

    VistaBatalla vistaBatalla = new VistaBatalla();
    Game game = new Game();
    String continuar = null;


    public void menuSeleccion(){
        boolean opcionValidada = false;
        do{
            vistaBatalla.mensajeMenu();
            Scanner sc = new Scanner(System.in);
            try{
                    int opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {

                        case 1 -> {
                            seleccionPersonaje();
                            opcionValidada = true;
                        }
                        case 2 -> preparacionBatalla();
                        case 3 -> {
                            System.out.println("Salir");
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

        do {

            // Atributos para nuestros Personajes
            int faccion = 0;
            int vida = 0;
            int armadura = 0;
            String raza = null;

            // Variables bandera para controlar el flujo

            boolean faccionValidada = false;
            boolean heroeValidado = false;
            boolean bestiaValidado = false;
            boolean vidaValidada = false;
            boolean armaduraValidada = false;
            boolean otroPersonajeValidado = false;


            Scanner sc = new Scanner(System.in);
            vistaBatalla.mensajeIntroduceNombre(); // Introduce nombre
            String nombre = sc.nextLine();
            
            do {
                try{
                vistaBatalla.mensajeIntroduceFaccion();
                faccion = Integer.parseInt(sc.nextLine());

                switch (faccion) {
                    case 1 -> {
                        do{
                            try{
                                vistaBatalla.mensajeIntroduceRazaHeroe();
                                int numeroHeroe = Integer.parseInt(sc.nextLine());
                                switch (numeroHeroe) {
                                    case 1 -> {
                                        raza = "Elfos";
                                        heroeValidado = true;
                                    }
                                    case 2 -> {
                                        raza = "Enanos";
                                        heroeValidado = true;
                                    }
                                    case 3 -> {
                                        raza = "Humanos";
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
                        vistaBatalla.mensajeIntroduceRazaBestia();
                        int numeroBestia = Integer.parseInt(sc.nextLine());
                        raza = switch (numeroBestia) {
                            case 1 -> "Orco";
                            case 2 -> "Trasgo";
                            case 3 -> "Uruk";
                            default -> raza;
                        };
                        faccionValidada = true;
                    }
                    default -> System.out.println("Introduce la facción correcta");
                }
                }catch(NumberFormatException e){
                    System.out.println("Introduce un valor válido");
                }
            }while(!faccionValidada);

            do {
                try {

                    vistaBatalla.mensajeVida();
                    vida = Integer.parseInt(sc.nextLine());
                    vidaValidada = true;

                } catch (NumberFormatException e) {
                    System.out.println("Introduce un valor válido");
                }
            }while(!vidaValidada);


            do{
                try{
                    vistaBatalla.mensajeArmadura();
                    armadura = Integer.parseInt(sc.nextLine());
                    armaduraValidada = true;
                }catch(NumberFormatException n){
                    System.out.println("Introduce un valor válido");
                }
            }while(!armaduraValidada);


            //Paso estos atributos para la creación de mi personaje y los agrego al Set Bestia o Heroe

            if (faccion == 1) {
                game.crearPersonajeHeroe(nombre, vida, armadura, raza);
                System.out.println("Tu ejercito de Héroes está conformado por: ");
                game.getEjercitoBien().forEach(heroe -> {
                    System.out.println(heroe.toString());
                });

            }
            else {
                game.crearPersonajeBestia(nombre, vida, armadura, raza);
                System.out.println("Tu ejercito de Bestias está conformado por: ");
                game.getEjercitoMal().forEach(bestia -> {
                    System.out.println(bestia.toString());
                });
            }
            do {
                System.out.println("¿Crear otro personaje?: Si/No");
                continuar = sc.nextLine();
                if (continuar.equals("Si") || continuar.equals("No")) {
                    otroPersonajeValidado = true;
                }else{
                    System.out.println("Introduce un valor valido para continuar");
                }
            }while(!otroPersonajeValidado);

        } while (continuar.equalsIgnoreCase("Si"));
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
        try{
            do{
                vistaBatalla.preparacionBatalla();
                Scanner sc = new Scanner(System.in);
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion){
                    case 1 -> {
                        game.ordenarLista(game.getEjercitoBien(), opcion);
                        game.ordenarLista(game.getEjercitoMal(), opcion);
                        opcionValidada = true;
                    }

                    case 2 -> {
                        System.out.println("Empieza la batalla");
                        //Aquí función de partida;
                        opcionValidada = true;
                    }
                    default -> System.out.println("Elija una opción correcta");
                }
            }while(!opcionValidada);


        }catch(NumberFormatException e){
            System.out.println("El formato introducido no es válido");
        }

    }


    // COMENZANDO LA BATALLA

    public void controladorBatalla(){

    }
}
