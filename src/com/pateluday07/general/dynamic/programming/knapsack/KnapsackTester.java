package com.pateluday07.general.dynamic.programming.knapsack;

public class KnapsackTester {

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5, 9, 7, 3, 6, 4, 8, 9, 3, 2, 1, 7, 5, 3, 6, 5, 9};
        int[] values  = {3, 4, 8, 8, 10, 7, 6, 9, 4, 8, 6, 2, 1, 2, 5, 6, 4, 5, 7, 9};
        int capacity = 30;

        KnapsackProblem knapsackProblem = new KnapsackProblem();
        KnapsackResult result = knapsackProblem.findIncludedItemsAndMaxValue(weights, values, capacity);
        System.out.println(result);
    }
}
