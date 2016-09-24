package com.java.training.animales;

public abstract class Animal {
    private boolean isAlive = false;
    private String nombre;

    public Animal( String nombre ){
        isAlive = true;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    protected void die(){
        this.isAlive = false;
    }

    @Override
    public String toString() {
        if( nombre != null ){
            return nombre;
        }

        return super.toString();
    }

    public static Animal[] getAnimalList(){
        return new Animal[]{
                new Leon(),
                new Mandril(),
                new Mono(),
                new Orangutan(),
                new Tigre()
        };
    }
}