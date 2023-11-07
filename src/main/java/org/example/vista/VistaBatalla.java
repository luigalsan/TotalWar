package org.example.vista;

import java.util.Scanner;

public class VistaBatalla {
    Scanner sc = new Scanner(System.in);

    public VistaBatalla() {

    }

    public static int mensajeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: " +
                "\n1. Agregar personajes" +
                "\n2. Jugar" +
                "\n3. Salir");

        return Integer.parseInt(sc.nextLine());

    }

    // MENSAJES  PARA LA OPCIÓN 1. AGREGAR PERSONAJES
    public static String mensajeIntroduceNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del personaje: ");

        return sc.nextLine();
    }

    public static int mensajeIntroduceFaccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige facción: " +
                "\n1. Heroes" +
                "\n2. Bestias");

        return Integer.parseInt(sc.nextLine());
    }

    public static int mensajeIntroduceRazaBestia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige raza: " +
                "\n1. Orco" +
                "\n2. Trasgo" +
                "\n3. Uruk ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int mensajeIntroduceRazaHeroe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige raza: " +
                "\n1. Elfo" +
                "\n2. Enano" +
                "\n3. Humano ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int mensajeVida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce puntos de vida: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int mensajeArmadura() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce puntos de armadura: ");
        return Integer.parseInt(sc.nextLine());
    }

    // MENSAJES PARA LA OPCIÓN 2. JUGAR

    // 2.1. PREPARAR CAMPO DE BATALLA

    public static int preparacionBatalla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: " +
                "\n1. Prepara el campo de batalla" +
                "\n2. Comienza la batalla!!");
        return Integer.parseInt(sc.nextLine());
    }


    // MENSAJES PARA LA OPCIÓN 3. FIN DE PARTIDA

    public void mensajeFinPartida(String muerto, String nombre) {

        System.out.println("¡Muere " + muerto + " " + nombre + "!");

        String mensaje = (muerto.equals("Bestia")) ? "¡¡VICTORIA DE LOS HEROES!!" : "¡¡VICTORIA DE LAS BESTIAS!!";
        System.out.println(mensaje);

    }

    public static void detallePersonajesBatalla(String nombre, int valorDado, int vida, String armadura) {

        System.out.println("Lucha entre " + nombre + " (Vida= " + vida
                + ") (Armadura= " + armadura + ")");
    }

    public static void detalleMuerte(String nombre){
        System.out.println("¡Muere " + nombre + "!");
    }

    public static void victoriaHeroes(){
        System.out.println("¡¡¡ VICTORIA DE LOS HEROES !!!");
    }

    public static void victoriaBestias(){
        System.out.println("¡¡¡ VICTORIA DE LAS BESTIAS !!!");
    }


}
