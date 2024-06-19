package com.aluracursos.screenmatch.generics;


public class Main {
    public static void main(String[] args) {
        GenericPrinter<Integer> gn = new GenericPrinter();
        gn.thingToPrint = 10;
        gn.print();

        Integer myInt = 10;
        Integer y = 20;
        System.out.println(myInt + y);

        var x = gn.sum(myInt, 10);
        System.out.println(x);
    }
}
