package com.pateluday07.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList(Node head) {
        nodeNullCheck(head);
        this.head = head;
        Node temp = head;
        increaseSizeByOne();
        while (temp.getNext() != null) {
            temp = temp.getNext();
            increaseSizeByOne();
        }
        this.tail = temp;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean addFirst(Node node) {
        nodeNullCheck(node);
        node.setNext(head);
        head = node;
        increaseSizeByOne();
        return true;
    }

    public boolean addLast(Node node) {
        nodeNullCheck(node);
        tail.setNext(node);
        tail = node;
        increaseSizeByOne();
        return true;
    }

    public boolean addAtIndex(int index, Node node) {
        nodeNullCheck(node);
        if (index < 0 || index > getSize()) {
            return false;
        } else if (index == 0) {
            return addFirst(node);
        } else if (index == getSize()) {
            return addLast(node);
        }
        Node tNode = getNodeJustBeforeIndex(index);
        node.setNext(tNode.getNext());
        tNode.setNext(node);
        increaseSizeByOne();
        return true;
    }

    public boolean removeFirst() {
        head = head.getNext();
        decreaseSizeByOne();
        return true;
    }

    public boolean removeLast() {
        Node tNode = getNodeJustBeforeIndex(getSize() - 1);
        tNode.setNext(null);
        tail = tNode;
        decreaseSizeByOne();
        return true;
    }

    public boolean removeFromIndex(int index) {
        if (index < 0 || index >= getSize()) {
            return false;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == getSize() - 1) {
            return removeLast();
        }

        Node tNode = getNodeJustBeforeIndex(index);
        tNode.setNext(tNode.getNext().getNext());
        decreaseSizeByOne();
        return true;
    }

    private void increaseSizeByOne() {
        size++;
    }

    private void decreaseSizeByOne() {
        size--;
    }

    private Node getNodeJustBeforeIndex(int index) {
        Node tNode = getHead();
        for (int i = 1; i < index; i++) {
            tNode = tNode.getNext();
        }
        return tNode;
    }

    private void nodeNullCheck(Node node) {
        if (node == null)
            throw new IllegalArgumentException("Node cannot be null");
    }
}
