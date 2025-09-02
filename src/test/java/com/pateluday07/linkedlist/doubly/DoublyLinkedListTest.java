package com.pateluday07.linkedlist.doubly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testAddFirst() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        DoublyNode node0 = new DoublyNode(0);
        list.addFirst(node0);
        assertEquals(0, list.getHead().getValue());
        assertEquals(2, list.getSize());
    }

    @Test
    void testAddLast() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        DoublyNode node2 = new DoublyNode(2);
        list.addLast(node2);
        assertEquals(2, list.getTail().getValue());
        assertEquals(2, list.getSize());
    }

    @Test
    void testAddAtIndex() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        node1.setNext(node2);
        node2.setPrevious(node1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        DoublyNode node3 = new DoublyNode(3);
        list.addAtIndex(1, node3);
        assertEquals(3, list.getHead().getNext().getValue());
        assertEquals(3, list.getSize());
    }

    @Test
    void testRemoveFirst() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        node1.setNext(node2);
        node2.setPrevious(node1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeFirst();
        assertEquals(2, list.getHead().getValue());
        assertEquals(1, list.getSize());
    }

    @Test
    void testRemoveFirstSingleElement() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeFirst();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveLast() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        node1.setNext(node2);
        node2.setPrevious(node1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeLast();
        assertEquals(1, list.getTail().getValue());
        assertEquals(1, list.getSize());
    }

    @Test
    void testRemoveLastSingleElement() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeLast();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveFromIndex() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        DoublyNode node3 = new DoublyNode(3);
        node1.setNext(node2);
        node2.setPrevious(node1);
        node2.setNext(node3);
        node3.setPrevious(node2);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeFromIndex(1);
        assertEquals(3, list.getHead().getNext().getValue());
        assertEquals(2, list.getSize());
    }

    @Test
    void testRemoveFromIndexSingleElement() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        list.removeFromIndex(0);
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveFromIndexOutOfBounds() {
        DoublyNode node1 = new DoublyNode(1);
        DoublyLinkedList list = new DoublyLinkedList(node1);
        assertThrowsExactly(IllegalArgumentException.class,() -> list.removeFromIndex(5));
        assertThrowsExactly(IllegalArgumentException.class,() -> list.removeFromIndex(-1));
    }

    @Test
    void emptyListInitialization() {
        DoublyLinkedList list = new DoublyLinkedList();
        assertNull(list.getHead());
        assertNull(list.getTail());
        assertEquals(0, list.getSize());
    }

    @Test
    void emptyListAddFirst() {
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyNode node1 = new DoublyNode(1);
        list.addFirst(node1);
        assertEquals(1, list.getHead().getValue());
        assertEquals(1, list.getTail().getValue());
        assertEquals(1, list.getSize());
    }

    @Test
    void emptyListAddLast() {
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyNode node1 = new DoublyNode(1);
        list.addLast(node1);
        assertEquals(1, list.getHead().getValue());
        assertEquals(1, list.getTail().getValue());
        assertEquals(1, list.getSize());
    }

}
