package org.example.learn.generics;

import java.io.Serializable;

public class PrinterAnimal <T extends Animal & Serializable>{

    T animalToPrint;

    public PrinterAnimal(T animal){
        this.animalToPrint = animal;
    }

    public void Print(){
        animalToPrint.makeNoise();
        System.out.println(animalToPrint);
    }
}
