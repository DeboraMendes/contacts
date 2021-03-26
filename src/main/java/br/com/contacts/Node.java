package br.com.contacts;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private final Map<Character, Node> entries;
    private int numberOfEntries;

    public Node() {
        entries = new HashMap<>();
    }

    protected void incrementCount() {
        numberOfEntries++;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public Map<Character, Node> getEntries() {
        return entries;
    }

}
