package com.pateluday07.general.dynamic.programming.knapsack;

import java.util.ArrayList;
import java.util.List;

public class KnapsackResult {

    private int maxValue;
    private List<Integer> selectedItems = new ArrayList<>();

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public List<Integer> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<Integer> selectedItems) {
        this.selectedItems = selectedItems;
    }

    @Override
    public String toString() {
        return "MaxValue And Included Items {" +
                "maxValue=" + maxValue +
                ", selectedItems=" + selectedItems +
                '}';
    }

}
