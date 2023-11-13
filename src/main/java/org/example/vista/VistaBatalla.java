package org.example.vista;

import org.example.model.Personaje;

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
        System.out.println("*************************************** ¡ ATENCIÓN ! ***************************************" +
                "\nPara crear el personaje, es necesario introducir un nombre que empiece por mayúscula y al menos tenga tres letras para crear el personaje\n");
    }

    public static void mensajeEjercitosRequeridos(){
        System.out.println("***** ¡ ATENCIÓN ! *****" +
                "\nSe necesita crear un ejército de cada tipo para comenzar la batalla\n");
    }

    public static void mensajeValorMayorCero(){
        System.out.println("***** ¡ ATENCIÓN ! *****" +
                "\nEl valor introducido tiene que ser entre 10 y 60 puntos\n");
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

    public static void mensajeNumberException(){
         System.out.println("***** ¡ ATENCIÓN ! *****" +
                "\nIntroduce un valor válido\n");


    }

    public static void mensajeDefault(){
        System.out.println("***** ¡ ATENCIÓN ! *****" +
                "\nIntroduce una opción valida\n");
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

    public static void mensajeTurno(int turno){
        System.out.println("Turno " + turno);
    }
    public static void detallePersonajesInicioBatalla(String nombreHeroe, String nombreBestia, int vidaHeroe, int vidaBestia, int armaduraHeroe, int armaduraBestia) {
        System.out.println("Lucha entre " + nombreHeroe + " (Vida= " + vidaHeroe
                + " Armadura= " + armaduraHeroe + ")" + " y " + nombreBestia + " (Vida= " + vidaBestia
                + " Armadura= " + armaduraBestia + ")" );
    }

    public static void detallePersonajeResultado(String atacante, int potenciaOfensiva, int danoRecibido, String defensor){
        System.out.println( atacante + " saca " + potenciaOfensiva + " y le quita " + danoRecibido + " de vida a " + defensor);
    }

    public static void detalleMuerte(Personaje personaje){
        System.out.println("¡Muere " + personaje.getClass().getSimpleName() +  " " + personaje.getNombre()  + "!");
    }
    public static void victoriaHeroes(){
        System.out.println();
        System.out.println();
        String letreroVictoria =
                "Yb    dP 88  dP\"\"b8 888888  dP\"Yb  88\"\"Yb 88    db        8888b.  888888     88      dP\"Yb  .dP\"Y8     88  88 888888 88\"\"Yb  dP\"Yb  888888 .dP\"Y8 \n" +
                        " Yb  dP  88 dP   `\"   88   dP   Yb 88__dP 88   dPYb        8I  Yb 88__       88     dP   Yb `Ybo.\"     88  88 88__   88__dP dP   Yb 88__   `Ybo.\" \n" +
                        "  YbdP   88 Yb        88   Yb   dP 88\"Yb  88  dP__Yb       8I  dY 88\"\"       88  .o Yb   dP o.`Y8b     888888 88\"\"   88\"Yb  Yb   dP 88\"\"   o.`Y8b \n" +
                        "   YP    88  YboodP   88    YbodP  88  Yb 88 dP\"\"\"\"Yb     8888Y\"  888888     88ood8  YbodP  8bodP'     88  88 888888 88  Yb  YbodP  888888 8bodP  ";

        System.out.println(letreroVictoria);
        System.out.println();
        System.out.println();

        String pattern = "                                  ....\n" +
                "                                .'' .'''\n" +
                ".                             .'   :\n" +
                "\\\\                          .:    :\n" +
                " \\\\                        _:    :       ..----.._\n" +
                "  \\\\                    .:::.....:::.. .'         ''.\n" +
                "   \\\\                 .'  #-. .-######'     #        '.\n" +
                "    \\\\                 '.##'/ ' ################       :\n" +
                "     \\\\                  #####################         :\n" +
                "      \\\\               ..##.-.#### .''''###'.._        :\n" +
                "       \\\\             :--:########:            '.    .' :\n" +
                "        \\\\..__...--.. :--:#######.'   '.         '.     :\n" +
                "        :     :  : : '':'-:'':'::        .         '.  .'\n" +
                "        '---'''..: :    ':    '..'''.      '.        :'\n" +
                "           \\\\  :: : :     '      ''''''.     '.      .:\n" +
                "            \\\\ ::  : :     '            '.      '      :\n" +
                "             \\\\::   : :           ....' ..:       '     '.\n" +
                "              \\:\\  : :    .....####\\ .~~.:.             :\n" +
                "               \\::   : :    '#######'===. ~ |.'-.   . '''.. :\n" +
                "                \\    .'  '########### \\ \\ _.' '. '-.       '.\n" +
                "                :\\  :     ########   \\ \\      '.  '-.        :\n" +
                "               :  \\'    '   #### :    \\ \\      :.    '-.      :\n" +
                "              :  .'\\   :'  :     :     \\ \\       :      '-.    :\n" +
                "             : .'  .\\  '  :      :     :\\ \\       :        '.   :\n" +
                "             ::   :  \\'  :.      :     :  \\ \\      :          '. :\n" +
                "             ::. :    \\  : :      :    ;  \\ \\     :           '.:\n" +
                "              : ':    '\\ :  :     :     :  \\:\\     :        ..'\n" +
                "                 :    ' \\ :        :     ;  \\|      :   .'''\n" +
                "                 '.   '  \\:                         :.''\n" +
                "                  .:..... \\:       :            ..''\n" +
                "                 '._____|'.\\......'''''''.:..'''\n" +
                "                            \\";

        System.out.println(pattern);


    }

    public static void victoriaBestias(){
        System.out.println();

        String letreroVictoria =
                "Yb    dP 88  dP\"\"b8 888888  dP\"Yb  88\"\"Yb 88    db        8888b.  888888     88        db    .dP\"Y8     88\"\"Yb 888888 .dP\"Y8 888888 88    db    .dP\"Y8 \n" +
                        " Yb  dP  88 dP   `\"   88   dP   Yb 88__dP 88   dPYb        8I  Yb 88__       88       dPYb   `Ybo.\"     88__dP 88__   `Ybo.\"   88   88   dPYb   `Ybo.\" \n" +
                        "  YbdP   88 Yb        88   Yb   dP 88\"Yb  88  dP__Yb       8I  dY 88\"\"       88  .o  dP__Yb  o.`Y8b     88\"\"Yb 88\"\"   o.`Y8b   88   88  dP__Yb  o.`Y8b \n" +
                        "   YP    88  YboodP   88    YbodP  88  Yb 88 dP\"\"\"\"Yb     8888Y\"  888888     88ood8 dP\"\"\"\"Yb 8bodP'     88oodP 888888 8bodP'   88   88 dP\"\"\"\"Yb 8bodP'  ";

        System.out.println(letreroVictoria);


        System.out.println();

        String logoBestia = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⣄⠤⠐⠂⠘⠗⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀        ⣀⠤⠊⡟⣷⣄⠀⠀⠀⣄⣠⣿⣄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀        ⠔⠉⠀⠀⠀⡜⠈⠃⠀⠀⠀⠾⢾⣿⣿⣷⣄⠀⠀⠀⠀\n" +
                "⠀⠀⠀        ⢀⠞⠀⠀⠀⠀⢀⣧⡮⡀⣄⠀⣠⣤⢄⢽⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀        ⢀⡊⠀⠀⠀⢰⠾⣿⣿⡷⠀⠀⠩⢀⣽⣾⣿⣿⣿⣿⠟⠀⠀⠀\n" +
                "⠀⠀        ⠸⡷⠀⠀⢀⢼⠒⢸⣿⣯⣿⣜⣵⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀\n" +
                "⠀⠀        ⢀⣷⢄⠀⠀⠘⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀\n" +
                "⠀⠀        ⠘⢹⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⢻⣿⣿⣷⣆⠀⠀\n" +
                "⠀⠀        ⢠⠀⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢻⣿⣿⣿⡀⠀\n" +
                "        ⢀⣿⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡌⠰⠼⢻⣿⣏⡇⠀\n" +
                "        ⣿⣿⠒⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⢰⡀⠀⠀⠀⠀⠀\n" +
                "        ⢻⣿⣄⠀⣿⣿⣿⣿⣿⣿⣿⣿⠏⠚⠁⠀⠈⢆⠀⠀⠀⠀⠀⠀\n" +
                "        ⢸⣿⣿⣷⣿⣿⣿⣿⠟⠛⣿⠋⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀\n" +
                "        ⢸⣿⣿⣿⣿⡿⠟⠁⠀⠀⠙⢦⡀⣄⣠⠴⠢⣾⣿⣿⣿⣶⣄⠀\n" +
                "        ⣾⣿⣿⣿⣿⣷⣶⣶⣄⠀⠀⠀⣁⠈⢇⠀⢀⣽⣿⣿⣿⣿⣿⣦⠀\n" +
                "        ⠈⠙⢿⣿⣿⣿⣿⠛⢿⡄⠀⠸⣿⣦⣈⣷⣿⡏⠙⠛⠛⠻⢿⣿⡆\n" +
                "⠀⠀        ⣠⣿⣿⡈⢿⣿⡁⡘⠀⠀⠀⣹⣿⣿⠛⠛⠁⠀⠀⠀⠀⠀⢿⠇\n" +
                "        ⢀⣴⣿⣿⠟⠀⠘⠻⠿⠃⠀⠀⠸⢿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠃\n" +
                "        ⢸⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣆⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀        ⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⢿⣿⣿⡿⠿⠂";

        System.out.println(logoBestia);
        System.out.println();
    }

    public static void empateHeroesBestias(){
        String asciiArt =
                "888888 8b    d8 88\"\"Yb    db    888888 888888     888888 88b 88 888888 88\"\"Yb 888888     88  88 888888 88\"\"Yb  dP\"Yb  888888 .dP\"Y8     Yb  dP     88\"\"Yb 888888 .dP\"Y8 888888 88    db    .dP\"Y8 \n" +
                        "88__   88b  d88 88__dP   dPYb     88   88__       88__   88Yb88   88   88__dP 88__       88  88 88__   88__dP dP   Yb 88__   `Ybo.\"      YbdP      88__dP 88__   `Ybo.\"   88   88   dPYb   `Ybo.\" \n" +
                        "88\"\"   88YbdP88 88\"\"\"   dP__Yb    88   88\"\"       88\"\"   88 Y88   88   88\"Yb  88\"\"       888888 88\"\"   88\"Yb  Yb   dP 88\"\"   o.`Y8b       8P       88\"\"Yb 88\"\"   o.`Y8b   88   88  dP__Yb  o.`Y8b \n" +
                        "888888 88 YY 88 88     dP\"\"\"\"Yb   88   888888     888888 88  Y8   88   88  Yb 888888     88  88 888888 88  Yb  YbodP  888888 8bodP'      dP        88oodP 888888 8bodP'   88   88 dP\"\"\"\"Yb 8bodP' ";

        System.out.println(asciiArt);
    }
}
