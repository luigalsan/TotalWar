package org.example.model;

import java.util.Objects;

public abstract class Personaje {

    private final String nombre;
    private int vida;
    private int armadura;
    private int potenciaOfensiva;


    public Personaje(String nombre, int vida, int armadura, int potenciaOfensiva) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.potenciaOfensiva = potenciaOfensiva;

    }

    public abstract int atacar(Personaje personaje);
    public abstract int recibirDano(Personaje personaje);

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

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getPotenciaOfensiva() {
        return potenciaOfensiva;
    }

    public void setPotenciaOfensiva(int potenciaOfensiva) {
        this.potenciaOfensiva = potenciaOfensiva;
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
        if (!(o instanceof Personaje personaje)) return false;
        boolean b = getVida() == personaje.getVida();
        return b && getArmadura() == personaje.getArmadura() && Objects.equals(getNombre(), personaje.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getVida(), getArmadura());
    }

}
