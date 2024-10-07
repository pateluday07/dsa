package com.pateluday07.trie.array;

public class TrieNode {
    private final TrieNode[] children = new TrieNode[26];
    private boolean isEndOfWord;

    public TrieNode[] getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }
}
