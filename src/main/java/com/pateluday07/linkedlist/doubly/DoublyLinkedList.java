package com.pateluday07.linkedlist.doubly;

public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;
    private int size = 0;

    public DoublyLinkedList() {
    }

    public DoublyLinkedList(DoublyNode doublyNode) {
        nullCheck(doublyNode);
        head = doublyNode;
        DoublyNode current = head;
        size++;
        while (current.getNext() != null) {
            DoublyNode pre = current;
            current = current.getNext();
            current.setPrevious(pre);
            size++;
        }
        tail = current;
    }

    public DoublyNode getHead() {
        return head;
    }

    public DoublyNode getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean addFirst(DoublyNode doublyNode) {
        nullCheck(doublyNode);
        if (head == null) {
            head = doublyNode;
            tail = doublyNode;
        } else {
            doublyNode.setNext(head);
            head.setPrevious(doublyNode);
            head = doublyNode;
        }
        size++;
        return true;
    }

    public boolean addLast(DoublyNode doublyNode) {
        nullCheck(doublyNode);
        if (head == null) {
            head = doublyNode;
            tail = doublyNode;
        } else {
            doublyNode.setPrevious(tail);
            tail.setNext(doublyNode);
            tail = doublyNode;
        }
        size++;
        return true;
    }

    public boolean addAtIndex(int index, DoublyNode doublyNode) {
        if (index == 0)
            return addFirst(doublyNode);
        else if (index == size)
            return addLast(doublyNode);

        DoublyNode current = getNodeFromIndex(index);
        doublyNode.setNext(current);
        doublyNode.setPrevious(current.getPrevious());
        current.getPrevious().setNext(doublyNode);
        current.setPrevious(doublyNode);
        size++;
        return true;
    }

    public boolean removeFirst() {
        if (removeIfSingleOrEmpty())
            return true;
        DoublyNode temp = head;
        head = head.getNext();
        head.setPrevious(null);
        temp.setNext(null);
        size--;
        return true;
    }

    public boolean removeLast() {
        if (removeIfSingleOrEmpty())
            return true;
        DoublyNode temp = tail.getPrevious();
        temp.setNext(null);
        tail.setPrevious(null);
        tail = temp;
        size--;
        return true;
    }

    public boolean removeFromIndex(int index) {
        indexCheck(index);
        if (removeIfSingleOrEmpty())
            return true;
        if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();

        DoublyNode current = getNodeFromIndex(index);
        DoublyNode previous = current.getPrevious();
        DoublyNode next = current.getNext();
        previous.setNext(next);
        next.setPrevious(previous);
        current.setNext(null);
        current.setPrevious(null);
        size--;
        return true;
    }

    public boolean removeByValue(int value) {
        DoublyNode node = head;

        while (node != null) {
            if (node.getValue() == value)
                break;
            node = node.getNext();
        }

        if (node == null)
            return false;
        else if (node == head)
            return removeFirst();
        else if (node == tail)
            return removeLast();

        DoublyNode pre = node.getPrevious();
        DoublyNode next = node.getNext();
        pre.setNext(next);
        next.setPrevious(pre);

        node.setNext(null);
        node.setPrevious(null);
        size--;
        return true;
    }

    private boolean removeIfSingleOrEmpty() {
        if (size == 0)
            throw new IllegalArgumentException("List is empty");
        else if (size == 1) {
            clear();
            return true;
        }
        return false;
    }

    private void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    private DoublyNode getNodeFromIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");
        DoublyNode temp;
        if (index < (size / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
        } else {
            temp = tail;
            for (int j = size - 1; j > index; j--) {
                temp = temp.getPrevious();
            }
        }
        return temp;
    }

    private void nullCheck(DoublyNode doublyNode) {
        if (doublyNode == null)
            throw new IllegalArgumentException("Node Can't be null");
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        DoublyNode current = head;
        while (current != null) {
            builder.append(current.getValue()).append(" <-> ");
            current = current.getNext();
        }
        builder.append("null");
        return builder.toString();
    }
}
