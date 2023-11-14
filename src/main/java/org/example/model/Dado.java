package org.example.model;

import java.util.Random;

public class Dado {

    private final Random random;

    public Dado(){
        random = new Random();
    }

    public int lanzarDado(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

}
