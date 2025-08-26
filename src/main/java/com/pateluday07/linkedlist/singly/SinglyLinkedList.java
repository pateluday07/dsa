package com.pateluday07.linkedlist.singly;

public class SinglyLinkedList {

    private SinglyNode head;
    private SinglyNode tail;
    private int size = 0;

    public SinglyLinkedList(SinglyNode head) {
        nodeNullCheck(head);
        this.head = head;
        SinglyNode temp = head;
        increaseSizeByOne();
        while (temp.getNext() != null) {
            temp = temp.getNext();
            increaseSizeByOne();
        }
        this.tail = temp;
    }

    public SinglyNode getHead() {
        return head;
    }

    public SinglyNode getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean addFirst(SinglyNode node) {
        nodeNullCheck(node);
        node.setNext(head);
        head = node;
        increaseSizeByOne();
        return true;
    }

    public boolean addLast(SinglyNode node) {
        nodeNullCheck(node);
        tail.setNext(node);
        tail = node;
        increaseSizeByOne();
        return true;
    }

    public boolean addAtIndex(int index, SinglyNode node) {
        nodeNullCheck(node);
        if (index < 0 || index > getSize()) {
            return false;
        } else if (index == 0) {
            return addFirst(node);
        } else if (index == getSize()) {
            return addLast(node);
        }
        SinglyNode tNode = getNodeJustBeforeIndex(index);
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
        SinglyNode tNode = getNodeJustBeforeIndex(getSize() - 1);
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

        SinglyNode tNode = getNodeJustBeforeIndex(index);
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

    private SinglyNode getNodeJustBeforeIndex(int index) {
        SinglyNode tNode = getHead();
        for (int i = 1; i < index; i++) {
            tNode = tNode.getNext();
        }
        return tNode;
    }

    private void nodeNullCheck(SinglyNode node) {
        if (node == null)
            throw new IllegalArgumentException("Node cannot be null");
    }
}
