package com.pateluday07.general.dynamic.programming.knapsack;

public class KnapsackProblem {

    public KnapsackResult findIncludedItemsAndMaxValue(int[] weights, int[] values, int capacity) {
        int[][] dpTable = prepareDPTable(weights, values, capacity);
        System.out.println("DP Table\n===============");
        for (int i = 0; i < dpTable.length; i++) {
            System.out.print("Item " + i + ": ");
            for (int j = 0; j < dpTable[i].length; j++) {
                System.out.print(dpTable[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }

    private int[][] prepareDPTable(int[] weights, int[] values, int capacity) {
        int items = weights.length + 1;
        int maxCapacity = capacity + 1;
        int[][] dpTable = new int[items][maxCapacity];

        for (int i = 0; i < items; i++) {
            for (int j = 0; j < maxCapacity; j++) {
                if (i == 0 || j == 0) {
                    dpTable[i][j] = 0;
                } else if (weights[i - 1] > j) {
                    dpTable[i][j] = dpTable[i - 1][j];
                } else {
                    int previousValue = dpTable[i - 1][j];
                    int currentValue = values[i - 1] + dpTable[i - 1][j - weights[i - 1]];
                    dpTable[i][j] = Math.max(previousValue, currentValue);
                }
            }
        }
        return dpTable;
    }

}


