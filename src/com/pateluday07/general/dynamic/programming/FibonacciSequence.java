package com.pateluday07.general.dynamic.programming;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    private static final List<Integer> FIBONACCI_SEQUENCE = new ArrayList<>();

    static {
        FIBONACCI_SEQUENCE.add(0);
        FIBONACCI_SEQUENCE.add(1);
    }

    public List<Integer> generateFibonacciSequence(int n) {
        if (n <= FIBONACCI_SEQUENCE.size())
            return FIBONACCI_SEQUENCE.subList(0, n);

        for (int i = FIBONACCI_SEQUENCE.size(); i < n; i++) {
            FIBONACCI_SEQUENCE.add(FIBONACCI_SEQUENCE.get(i - 2) + FIBONACCI_SEQUENCE.get(i - 1));
        }

        return FIBONACCI_SEQUENCE;
    }
}
