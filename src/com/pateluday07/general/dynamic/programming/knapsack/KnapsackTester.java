package com.pateluday07.general.dynamic.programming.knapsack;

public class KnapsackTester {

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {15, 20, 50, 60, 60};
        int capacity = 6;
        KnapsackProblem knapsackProblem = new KnapsackProblem();
        knapsackProblem.findIncludedItemsAndMaxValue(weights, values, capacity);
    }
}
