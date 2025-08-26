package com.pateluday07.general.recursion;

public class FactorialRecursion {

    public int findFactorial(int num) {
        if (num < 0)
            return num;
        if (num == 0 || num == 1)
            return 1;
        return num * findFactorial(--num);
    }

}
