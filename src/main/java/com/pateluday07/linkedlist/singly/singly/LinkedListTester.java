package com.pateluday07.linkedlist.singly.singly;

public class LinkedListTester {

    public static void main(String[] args) {
        SinglyNode node1 = new SinglyNode(1);
        SinglyNode node2 = new SinglyNode(2);
        SinglyNode node3 = new SinglyNode(3);
        SinglyNode node4 = new SinglyNode(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(node1);

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());

        System.out.println("\nAdd at First");
        SinglyNode node0 = new SinglyNode(0);
        singlyLinkedList.addFirst(node0);

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());

        System.out.println("\nAdd at Last");
        SinglyNode node5 = new SinglyNode(5);
        singlyLinkedList.addLast(node5);

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());

        System.out.println("\nAdd at index");
        SinglyNode nodeAtIndex = new SinglyNode(0);
        singlyLinkedList.addAtIndex(2, nodeAtIndex);

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());

        System.out.println("\nRemove First Node");
        singlyLinkedList.removeFirst();

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());

        System.out.println("\nRemove Last Node");
        singlyLinkedList.removeLast();

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());


        System.out.println("\nRemove From Index");
        singlyLinkedList.removeFromIndex(3);

        System.out.println(singlyLinkedList);

        System.out.println("Head: " + singlyLinkedList.getHead().getVal());
        System.out.println("Tail: " + singlyLinkedList.getTail().getVal());
        System.out.println("Size: " + singlyLinkedList.getSize());
    }

}
