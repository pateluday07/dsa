package com.pateluday07.linkedlist.doubly;

public class DoublyNode {

    private DoublyNode previous;
    private DoublyNode next;
    private int value;

    public DoublyNode(int value) {
        this.value = value;
    }

    public DoublyNode(DoublyNode previous, DoublyNode next, int value) {
        this.previous = previous;
        this.next = next;
        this.value = value;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
