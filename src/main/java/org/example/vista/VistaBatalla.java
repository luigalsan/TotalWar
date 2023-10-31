package org.example.vista;

public class VistaBatalla {

    public VistaBatalla() {

    }

    public void mensajeMenu(){
        System.out.println("Elige una opción: " +
                "\n1. Agregar personajes" +
                "\n2. Jugar" +
                "\n3. Salir");
    }

    // MENSAJES  PARA LA OPCIÓN 1. AGREGAR PERSONAJES
    public void mensajeIntroduceNombre(){
        System.out.println("Introduce nombre del personaje: ");
    }
    public void mensajeIntroduceFaccion(){
        System.out.println("Elige facción: " +
                "\n1. Heroes" +
                "\n2. Bestias");
    }

    public void mensajeIntroduceRazaBestia(){
        System.out.println("Elige raza: " +
                "\n1. Orco" +
                "\n2. Trasgo" +
                "\n3. Uruk ") ;

    }
    public void mensajeIntroduceRazaHeroe(){
        System.out.println("Elige raza: " +
                "\n1. Elfo" +
                "\n2. Enano" +
                "\n3. Humano ") ;
    }

    public void mensajeVida(){
        System.out.println("Introduce puntos de vida: ");
    }

    public void mensajeArmadura(){
        System.out.println("Introduce puntos de armadura: ");
    }

    // MENSAJES PARA LA OPCIÓN 2. JUGAR

    // 2.1. PREPARAR CAMPO DE BATALLA

    public void mensajeJugar(){

        System.out.println("Elige una opción: " +
                "\n1. Prepara el campo de batalla" +
                "\n2. Comienza la batalla!!");
    }


    // MENSAJES PARA LA OPCIÓN 3. FIN DE PARTIDA

    public void mensajeFinPartida(String muerto, String nombre){

        System.out.println("¡Muere " + muerto + " " + nombre + "!");

        String mensaje = (muerto.equals("Bestia")) ? "¡¡VICTORIA DE LOS HEROES!!" : "¡¡VICTORIA DE LAS BESTIAS!!";
        System.out.println(mensaje);

    }




}
