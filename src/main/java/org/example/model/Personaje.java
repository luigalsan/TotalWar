package org.example.model;

import java.util.Objects;

public abstract class Personaje {

    private String nombre;
    private int vida;
    private int armadura;


    public Personaje(String nombre, int vida, int armadura) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + vida +
                ", armadura=" + armadura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje personaje)) return false;
        boolean b = getVida() == personaje.getVida();
        return b && getArmadura() == personaje.getArmadura() && Objects.equals(getNombre(), personaje.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getVida(), getArmadura());
    }


}
