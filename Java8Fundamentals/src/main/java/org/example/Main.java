package org.example;

import org.example.learn.foreach.LearnForEach;
import org.example.learn.generics.*;
import org.example.learn.lambda.*;
import org.example.learn.newinterface.MyClassInt;
import org.example.learn.newinterface.MyDataImpl;
import org.example.learn.stream.MyStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void learnForEach(){
        LearnForEach learnForEach = new LearnForEach();
        learnForEach.TraversingForEach();
    }

    public static void learnInterface(){
        MyClassInt myClassInt = new MyClassInt();
        myClassInt.log("Default method is cool");
    }

    public static void learnInterface2() {
        MyDataImpl myData = new MyDataImpl();
        myData.print("");
        myData.isNull("abc");
        myData.print("ALOHA");
    }

    public static void learnFunctionalInterface() {
        FunctionalInterface1 funcInt1 = new FunctionalInterface1Impl();
        List<String> list = new ArrayList<>();
        list.add("felipe");
        list.add("jesus");
        System.out.println(funcInt1.m(list));

        // With lambda you can implement the interface right away.
        FunctionalInterface1 funcInt1Lambda = (Iterable<String> it) -> "Hello Lambda";
        System.out.println(funcInt1Lambda.m(list));
    }

    public static void learnLambda1() {
        Integer checkPrime = 10;
        System.out.println("Is "+checkPrime+ " Prime: "+ CalculatePrime.isPrimeDeclarativeApproach(checkPrime));
        checkPrime = 7;
        System.out.println("Is "+checkPrime+ " Prime: "+ CalculatePrime.isPrimeDeclarativeApproach(checkPrime));
    }

    public static void learnLambda2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        // sum of all numbers
        System.out.println(BehaviouredMethod.sumWithCondition(list, n -> true));
        // sum of all even numbers
        System.out.println(BehaviouredMethod.sumWithCondition(list, n -> n % 2 == 0));
        // sum of all numbers greater than 5
        System.out.println(BehaviouredMethod.sumWithCondition(list, n -> n > 5));
    }

    public static void learnLambda3() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,12));
        System.out.println(LazinessEfficiency.findSquareOfMaxOddTraditionalWay(list));
        System.out.println(LazinessEfficiency.findSquareOfMaxOdd(list));
    }

    public static void learnStream1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,13));
        System.out.println(MyStreams.sumIterator(list));
    }

    public static void learnStream2() {
        MyStreams.convertStreamToCollection();
    }

    public static void learnStream3() {
        MyStreams.intermediateOperationFilter();
        MyStreams.intermediateOperationMap();
        MyStreams.intermediateOperationSorted();
        MyStreams.intermediateOperationsFlatMap();
    }

    public static void learnStream4() {
        MyStreams.terminalOperationsReduce();
        MyStreams.terminalOperationsCount();
        MyStreams.terminalOperationsForEach();
        MyStreams.terminalOperationsMatch();
        MyStreams.terminalOperationsFindFirst();
    }

    public static void learnGenerics() {
        Printer<Integer> printer = new Printer<>(10);
        printer.print();

        Printer<Double> printer2 = new Printer<>(23.5);
        printer2.print();

        Dog dog = new Dog();
        PrinterAnimal<Dog> printer3 = new PrinterAnimal<>(dog);
        printer3.Print();

        StaticMethod.shout(new Cat());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        StaticMethod.printList(animals);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        learnForEach();
//        learnInterface();
//        learnInterface2();
//        learnFunctionalInterface();
//        learnLambda1();
//        learnLambda2();
//        learnLambda3();
//        learnStream1();
//        learnStream2();
//        learnStream3();
//        learnStream4();
        learnGenerics();
//
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//        int size = sc.nextInt();
    }


}