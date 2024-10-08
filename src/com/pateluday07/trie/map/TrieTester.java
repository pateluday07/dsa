package com.pateluday07.trie.map;

import java.util.Arrays;
import java.util.Comparator;

public class TrieTester {

    public static void main(String[] args) {
        Trie trie = new Trie();

        //search common prefix from arr
        String[] words = {"flower", "flow", "flight"};
        //String[] words = {"dog","racecar","car"};
        trie.insert(words[0]);
        String result = Arrays.stream(words)
                .map(trie::searchPrefix)
                .min(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(result);
        System.out.println();

        //search for words
        Arrays.asList(words).forEach(trie::insert);
        System.out.println(trie.search("flight"));
        System.out.println(trie.search("fly"));
        System.out.println(trie.search("flower"));
    }

}
