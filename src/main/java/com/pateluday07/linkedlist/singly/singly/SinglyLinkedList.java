package com.pateluday07.linkedlist.singly.singly;

public class SinglyLinkedList {

    private SinglyNode head;
    private SinglyNode tail;
    private int size = 0;

    public SinglyLinkedList() {

    }

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
        if(head != null)
            node.setNext(head);
        head = node;
        increaseSizeByOne();
        if (getSize() == 1)
            tail = head;
        return true;
    }

    public boolean addLast(SinglyNode node) {
        nodeNullCheck(node);
        if (tail != null)
            tail.setNext(node);
        tail = node;
        increaseSizeByOne();
        if( getSize() == 1)
            head = tail;
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
        if( getSize() == 0)
            return false;
        if (getSize() == 1)
            return clear();
        head = head.getNext();
        decreaseSizeByOne();
        return true;
    }

    public boolean removeLast() {
        if( getSize() == 0)
            return false;
        if (getSize() == 1)
            return clear();
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
        if (index < 1 || index > getSize())
            throw new IllegalArgumentException("Index out of bounds");
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

    private boolean clear() {
        head = null;
        tail = null;
        size = 0;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SinglyNode temp = head;
        sb.append("SinglyLinkedList{");
        while (temp != null) {
            sb.append(temp.getVal());
            if (temp.getNext() != null) {
                sb.append(" -> ");
            }
            temp = temp.getNext();
        }
        sb.append('}');
        return sb.toString();
    }

}
