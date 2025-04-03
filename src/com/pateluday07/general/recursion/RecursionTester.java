package com.pateluday07.general.recursion;

public class RecursionTester {

    public static void main(String[] args) {
        //find factorial
        int i = 5;
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        System.out.println("Find Factorial of Number: " + i);
        System.out.println("Factorial: " + factorialRecursion.findFactorial(i));

    }
}
