package com.pateluday07.general.dynamic.programming;

public class DynamicProgrammingTester {

    public static void main(String[] args) {
        //Fibonacci Sequence
        int i = 6;
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println("Generate " + i + " Fibonacci Sequence");
        System.out.println("Fibonacci Sequence: " + fibonacciSequence.generateFibonacciSequence(i) + "\n");

        i = 7;
        System.out.println("Generate " + i + " Fibonacci Sequence");
        System.out.println("Fibonacci Sequence: " + fibonacciSequence.generateFibonacciSequence(i) + "\n");

        i = 4;
        System.out.println("Generate " + i + " Fibonacci Sequence");
        System.out.println("Fibonacci Sequence: " + fibonacciSequence.generateFibonacciSequence(i) + "\n");
    }
}
