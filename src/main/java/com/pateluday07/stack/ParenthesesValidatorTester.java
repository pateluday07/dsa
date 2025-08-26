package com.pateluday07.stack;

import java.util.Arrays;
import java.util.List;

public class ParenthesesValidatorTester {

    public static void main(String[] args) {
        ParenthesesValidator validator = new ParenthesesValidator();

        List<String> parenthesesArray = Arrays.asList(
                "()[]{}",    // Valid
                "([{}])",    // Valid
                "(]",        // Invalid
                "([)]",      // Invalid
                "{[]}",      // Valid
                "((()))",    // Valid
                "(()",       // Invalid
                ""           // Valid (empty string)
        );

        parenthesesArray.forEach(p -> System.out.println("Parentheses: " + p + " -> Is valid? " + validator.validate(p)));
    }
}
