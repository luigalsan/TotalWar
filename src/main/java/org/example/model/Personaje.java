package org.example.model;

import java.util.Objects;

public abstract class Personaje {

    private final String nombre;
    private int vida;
    private int armadura;
    private int potenciaOfensiva;


    public Personaje(String nombre, int vida, int armadura) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.potenciaOfensiva = 0;

    }

    public abstract int atacar(Personaje personaje);
    public abstract int recibirDano(Personaje personaje, int potenciaOfensiva);

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getPotenciaOfensiva() {
        return potenciaOfensiva;
    }

    public int setPotenciaOfensiva(int potenciaOfensiva) {
        this.potenciaOfensiva = potenciaOfensiva;
        return potenciaOfensiva;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", armadura=" + armadura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(getNombre(), personaje.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

}
