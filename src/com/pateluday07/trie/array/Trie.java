package com.pateluday07.trie.array;

public class Trie {

    private final TrieNode root = new TrieNode();

    void insert(String str) {
        TrieNode node = root;
        for (int level = 0; level < str.length(); level++) {
            int index = str.charAt(level) - 'a';
            if (node.getChildren()[index] == null)
                node.getChildren()[index] = new TrieNode();
            node = node.getChildren()[index];
        }
        node.setEndOfWord(true);
    }

    boolean search(String str) {
        TrieNode node = root;
        for (int level = 0; level < str.length(); level++) {
            int index = str.charAt(level) - 'a';
            if (node.getChildren()[index] == null) return false;
            node = node.getChildren()[index];
        }
        return node.isEndOfWord();
    }

    String searchPrefix(String str) {
        TrieNode node = root;
        StringBuilder builder = new StringBuilder();
        for (int level = 0; level < str.length(); level++) {
            int index = str.charAt(level) - 'a';
            if (node.getChildren()[index] == null) return builder.toString();
            node = node.getChildren()[index];
            builder.append(str.charAt(level));
        }
        return builder.toString();
    }

}
