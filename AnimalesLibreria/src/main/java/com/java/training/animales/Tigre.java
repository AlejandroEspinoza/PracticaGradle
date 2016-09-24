package com.java.training.animales;

import com.java.training.acciones.Trepar;

/**
 * Created by Alejandro on 9/5/16.
 */
public class Tigre extends Felino implements Trepar {
    public Tigre(){
        super( Tigre.class.getCanonicalName() );
    }

    @Override
    public void treparArbol() {
        System.out.println(this.getClass().getCanonicalName() + " trepando un Arbol.");
    }
}