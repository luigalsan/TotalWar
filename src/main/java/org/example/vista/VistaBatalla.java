package org.example.vista;

import java.util.Scanner;

public class VistaBatalla {
    Scanner sc = new Scanner(System.in);

    public VistaBatalla() {

    }
    public static void imprimirBanner() {
        System.out.println();

        String totalWar = "          _/_/_/_/_/    _/_/    _/_/_/_/_/    _/_/    _/            _/          _/    _/_/    _/_/_/    \n" +
                "             _/      _/    _/      _/      _/    _/  _/            _/          _/  _/    _/  _/    _/   \n" +
                "            _/      _/    _/      _/      _/_/_/_/  _/            _/    _/    _/  _/_/_/_/  _/_/_/      \n" +
                "           _/      _/    _/      _/      _/    _/  _/              _/  _/  _/    _/    _/  _/    _/     \n" +
                "          _/        _/_/        _/      _/    _/  _/_/_/_/          _/  _/      _/    _/  _/    _/";

        String lordOfTheRings = "         ___ . .  _\n" +
                "\"T$$$P\"   |  |_| |_\n" +
                " :$$$     |  | | |_\n" +
                " :$$$                                                      \"T$$$$$$$b.\n" +
                " :$$$     .g$$$$$p.   T$$$$b.    T$$$$$bp.                   BUG    \"Tb      T$b      T$P   .g$P^^T$$  ,gP^^T$$\n" +
                "  $$$    d^\"     \"^b   $$  \"Tb    $$    \"Tb    .s^s. :sssp   $$$     :$; T$$P $^b.     $   dP\"     `T :$P    `T\n" +
                "  :$$   dP         Tb  $$   :$;   $$      Tb  d'   `b $      $$$     :$;  $$  $ `Tp    $  d$           Tbp.\n" +
                "  :$$  :$;         :$; $$   :$;   $$      :$; T.   .P $^^    $$$    .dP   $$  $   ^b.  $ :$;            \"T$$p.\n" +
                "  $$$  :$;         :$; $$...dP    $$      :$;  `^s^' .$.     $$$...dP\"    $$  $    `Tp $ :$;     \"T$$      \"T$b\n" +
                "  $$$   Tb.       ,dP  $$\"\"\"Tb    $$      dP \"\"$\"\"$\" \"$\"$^^  $$$\"\"T$b     $$  $      ^b$  T$       T$ ;      $$;\n" +
                "  $$$    Tp._   _,gP   $$   `Tb.  $$    ,dP    $  $...$ $..  $$$   T$b    :$  $       `$   Tb.     :$ T.    ,dP\n" +
                "  $$$;    \"^$$$$$^\"   d$$     `T.d$$$$$P^\"     $  $\"\"\"$ $\"\", $$$    T$b  d$$bd$b      d$b   \"^TbsssP\" 'T$bgd$P\n" +
                "  $$$b.____.dP                                 $ .$. .$.$ss,d$$$b.   T$b.\n" +
                ".d$$$$$$$$$$P  ";

        System.out.println(lordOfTheRings);
        System.out.println();
        System.out.println(totalWar);
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
