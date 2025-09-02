package com.pateluday07.linkedlist.doubly;

public class DoublyLinkedListTester {

    public static void main(String[] args) {
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        DoublyNode node3 = new DoublyNode(3);
        DoublyNode node4 = new DoublyNode(4);

        node1.setNext(node2);
        node2.setPrevious(node1);
        node2.setNext(node3);
        node3.setPrevious(node2);
        node3.setNext(node4);
        node4.setPrevious(node3);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(node1);

        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nAdd at First");
        DoublyNode node0 = new DoublyNode(0);
        doublyLinkedList.addFirst(node0);

        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nAdd at Last");
        DoublyNode node5 = new DoublyNode(5);
        doublyLinkedList.addLast(node5);

        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nAdd at index");
        DoublyNode nodeAtIndex = new DoublyNode(0);
        doublyLinkedList.addAtIndex(2, nodeAtIndex);

        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nRemove First Node");
        doublyLinkedList.removeFirst();
        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nRemove Last Node");
        doublyLinkedList.removeLast();
        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nRemove at Index 2");
        doublyLinkedList.removeFromIndex(2);
        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

        System.out.println("\nRemove by Value 3");
        doublyLinkedList.removeByValue(3);
        System.out.println(doublyLinkedList);

        System.out.println("Head: " + doublyLinkedList.getHead().getValue());
        System.out.println("Tail: " + doublyLinkedList.getTail().getValue());
        System.out.println("Size: " + doublyLinkedList.getSize());

    }
}
