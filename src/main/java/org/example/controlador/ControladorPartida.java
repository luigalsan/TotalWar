package org.example.controlador;


import org.example.model.Game;
import org.example.vista.VistaBatalla;

import java.util.Scanner;

public class ControladorPartida {

    VistaBatalla vistaBatalla = new VistaBatalla();
    Game game = new Game();

    public void menuSeleccion(){
            vistaBatalla.mensajeMenu();
            Scanner sc = new Scanner(System.in);
            int opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){

                case 1:

                case 2:

                case 3:
                    System.out.println("Saliendo del menú");break;

            }

    }
    // Selección personaje
    public void seleccionPersonaje() {

        //Mediante el uso de Scanner recojo toda la información para la creación de mi personaje

        String continuar;
        do {
            Scanner sc = new Scanner(System.in);
            vistaBatalla.mensajeIntroduceNombre(); // Introduce nombre
            String nombre = sc.nextLine();
            int faccion;
            String raza = null;

            boolean faccionValidada = false;
            do {
                vistaBatalla.mensajeIntroduceFaccion();
                faccion = Integer.parseInt(sc.nextLine());


                switch (faccion) {
                    case 1 -> {
                        vistaBatalla.mensajeIntroduceRazaHeroe();
                        int numeroHeroe = Integer.parseInt(sc.nextLine());
                        switch (numeroHeroe) {
                            case 1 -> raza = "Elfos";
                            case 2 -> raza = "Enanos";
                            case 3 -> raza = "Humanos";
                        }
                        faccionValidada = true;
                    }
                    case 2 -> {
                        vistaBatalla.mensajeIntroduceRazaBestia();
                        int numeroBestia = Integer.parseInt(sc.nextLine());
                        raza = switch (numeroBestia) {
                            case 1 -> "Orcos";
                            case 2 -> "Trasgos";
                            case 3 -> "Uruk";
                            default -> raza;
                        };
                        faccionValidada = true;
                    }
                    default -> System.out.println("Introduce la facción correcta");

                }
            }while(!faccionValidada);

            vistaBatalla.mensajeVida();
            int vida = Integer.parseInt(sc.nextLine());

            vistaBatalla.mensajeArmadura();
            int armadura = Integer.parseInt(sc.nextLine());

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

            System.out.println("¿Crear otro personaje?: Si/No");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("Si"));

    }

    // Comienzo partida
}
