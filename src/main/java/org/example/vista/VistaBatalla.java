package org.example.vista;

import java.util.Scanner;

public class VistaBatalla {
    Scanner sc = new Scanner(System.in);

    public VistaBatalla() {

    }
    public static void imprimirBanner() {
        System.out.println();
        String banner =
                "ooooo                                 .o8                  .o88o.          .   oooo                       ooooooooo.    o8o                                  \n" +
                        "`888'                                \"888                  888 `\"        .o8   `888                       `888   `Y88.  `\"'                                  \n" +
                        " 888          .ooooo.  oooo d8b  .oooo888        .ooooo.  o888oo       .o888oo  888 .oo.    .ooooo.        888   .d88' oooo  ooo. .oo.    .oooooooo  .oooo.o \n" +
                        " 888         d88' `88b `888\"8P d88' `888       d88' `88b  888           888    888P\"Y88b  d88' `88b       888ooo88P'  `888  `888P\"Y88b  888' `88b  d88(  \"8 \n" +
                        " 888         888   888  888     888   888       888   888  888           888    888   888  888ooo888       888`88b.     888   888   888  888   888  `\"Y88b.  \n" +
                        " 888       o 888   888  888     888   888       888   888  888           888 .  888   888  888    .o       888  `88b.   888   888   888  `88bod8P'  o.  )88b \n" +
                        "o888ooooood8 `Y8bod8P' d888b    `Y8bod88P\"      `Y8bod8P' o888o          \"888\" o888o o888o `Y8bod8P'      o888o  o888o o888o o888o o888o `8oooooo.  8\"\"888P' \n" +
                        "                                                                                                                                         d\"     YD           \n" +
                        "                                                                                                                                         \"Y88888P'           ";

        System.out.println(banner);
        System.out.println();
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

    public static void mensajeIntroduceNombreError(){
        System.out.println("***** ¡ ATENCIÓN ! *****" +
                "\nPara crear el personaje, es necesario introducir un nombre que empiece por mayúscula y al menos tenga tres letras para crear el personaje\n");
    }

    public static String mensajeJugarDeNuevo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres jugar de nuevo?: Si/No");

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
                "\n2. Trasgo");
        return Integer.parseInt(sc.nextLine());
    }

    public static int mensajeIntroduceRazaHeroe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige raza: " +
                "\n1. Elfo" +
                "\n2. Hobbit" +
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

    public static String mensajeIntroducirOtroPersonaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres introducir otro personaje?: Si/No");

        return sc.nextLine();
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

    public static int ordenarEjercitos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ordenar por: " +
                "\n1. Nombre" +
                "\n2. Vida" +
                "\n3. Armadura");

        return Integer.parseInt(sc.nextLine());
    }

    public static void detalleEjercito(String tipoEjercito){
        System.out.println("Tu ejército de " + tipoEjercito + " está conformado por:");
    }
    public static void detallePersonajesInicioBatalla(String nombreHeroe, String nombreBestia, int vidaHeroe, int vidaBestia, int armaduraHeroe, int armaduraBestia) {

        System.out.println("Lucha entre " + nombreHeroe + " (Vida= " + vidaHeroe
                + " Armadura= " + armaduraHeroe + ")" + " y " + nombreBestia + " (Vida= " + vidaBestia
                + " Armadura= " + armaduraBestia + ")" );
    }

    public static void detallePersonajeResultado(String atacante, int potenciaOfensiva, int danoRecibido, String defensa){
        System.out.println( atacante + " saca " + potenciaOfensiva + " y le quita " + danoRecibido + " de vida a " + defensa);
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
