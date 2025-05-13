package com.pateluday07.sorting.bubble;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        Arrays
                .stream(arr)
                .forEachOrdered(n -> System.out.print(n + " "));
    }
}
