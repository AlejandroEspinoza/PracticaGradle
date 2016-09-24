package com.java.training.animales;

import com.java.training.acciones.Rugir;

/**
 * Created by Alejandro on 9/5/16.
 */
public class Felino extends Animal implements Rugir {
    public Felino( String nombre ){
        super(nombre);
    }

    public void rugir(){
        System.out.println(this.getClass().getCanonicalName() + " rugiendo.");
    }
}
