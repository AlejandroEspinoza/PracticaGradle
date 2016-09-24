package com.java.training.animales;

import com.java.training.acciones.Trepar;

/**
 * Created by Alejandro on 9/5/16.
 */
public abstract class Primate extends Animal implements Trepar {
    private boolean esCarnivoro;

    public Primate( String nombre, boolean esCarnivoro ){
        super( nombre );
    }

    @Override
    public void treparArbol() {
        System.out.println( this.getClass().getCanonicalName() + " trepando un Arbol.");
    }
}