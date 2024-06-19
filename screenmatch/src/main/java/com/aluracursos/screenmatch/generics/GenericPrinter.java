package com.aluracursos.screenmatch.generics;


public class GenericPrinter<T> {
    T thingToPrint;


    public void print() {
        System.out.println(this.thingToPrint);
    }


    public <W extends Number> Number sum (W w, Integer x){
        return (Number)(x.intValue() + w.intValue());
    }
}
