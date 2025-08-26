package com.pateluday07.trie.map;

public class Trie {

    private final TrieNode root = new TrieNode();

    void insert(String str) {
        TrieNode node = root;
        for (int level = 0; level < str.length(); level++) {
            node.getChildren().putIfAbsent(str.charAt(level), new TrieNode());
            node = node.getChildren().get(str.charAt(level));
        }
        node.setEndOfWord(true);
    }

    boolean search(String str) {
        TrieNode node = root;
        for (int level = 0; level < str.length(); level++) {
            if (!node.getChildren().containsKey(str.charAt(level))) return false;
            node = node.getChildren().get(str.charAt(level));
        }
        return node.isEndOfWord();
    }

    String searchPrefix(String str) {
        TrieNode node = root;
        StringBuilder builder = new StringBuilder();
        for (int level = 0; level < str.length(); level++) {
            if (!node.getChildren().containsKey(str.charAt(level))) return builder.toString();
            builder.append(str.charAt(level));
            node = node.getChildren().get(str.charAt(level));
        }
        return builder.toString();
    }

}
