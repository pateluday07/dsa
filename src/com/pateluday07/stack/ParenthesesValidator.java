package com.pateluday07.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ParenthesesValidator {

    public boolean validate(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                characters.push(c);
            } else {
                if (characters.empty()) return false;
                char top = characters.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{')
                    return false;
            }
        }
        return characters.isEmpty();
    }

    public boolean validateWithArrayDeque(String s) {
        Deque<Character> characters = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                characters.addLast(c);
            } else {
                if (characters.isEmpty()) return false;
                char top = characters.removeLast();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{')
                    return false;
            }
        }
        return characters.isEmpty();
    }


}
