package com.pateluday07.general.dynamic.programming.knapsack;

import java.util.List;

public class KnapsackResult {

    private final int maxValue;
    private final List<Integer> selectedItems;

    public KnapsackResult(int maxValue, List<Integer> selectedItems) {
        this.maxValue = maxValue;
        this.selectedItems = selectedItems;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public List<Integer> getSelectedItems() {
        return selectedItems;
    }

    @Override
    public String toString() {
        return "Max Value: " + maxValue + ", Selected Items: " + selectedItems;
    }

}
