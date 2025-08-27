package com.pateluday07.linkedlist.singly;

import com.pateluday07.linkedlist.singly.singly.SinglyLinkedList;
import com.pateluday07.linkedlist.singly.singly.SinglyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglySinglyLinkedListTest {

    @Test
    void testAddFirst() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        SinglyNode singlyNode0 = new SinglyNode(0);
        list.addFirst(singlyNode0);
        assertEquals(0, list.getHead().getVal());
        assertEquals(2, list.getSize());
    }

    @Test
    void testAddLast() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        SinglyNode singlyNode2 = new SinglyNode(2);
        list.addLast(singlyNode2);
        assertEquals(2, list.getTail().getVal());
        assertEquals(2, list.getSize());
    }

    @Test
    void testAddAtIndex() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyNode singlyNode2 = new SinglyNode(2);
        singlyNode1.setNext(singlyNode2);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        SinglyNode singlyNode3 = new SinglyNode(3);
        list.addAtIndex(1, singlyNode3);
        assertEquals(3, list.getHead().getNext().getVal());
        assertEquals(3, list.getSize());
    }

    @Test
    void testRemoveFirst() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyNode singlyNode2 = new SinglyNode(2);
        singlyNode1.setNext(singlyNode2);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeFirst();
        assertEquals(2, list.getHead().getVal());
        assertEquals(1, list.getSize());
    }

    @Test
    void testRemoveFirstSingleElement() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeFirst();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveLast() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyNode singlyNode2 = new SinglyNode(2);
        singlyNode1.setNext(singlyNode2);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeLast();
        assertEquals(1, list.getTail().getVal());
        assertEquals(1, list.getSize());
    }

    @Test
    void testRemoveLastSingleElement() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeLast();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveFromIndex() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyNode singlyNode2 = new SinglyNode(2);
        SinglyNode singlyNode3 = new SinglyNode(3);
        singlyNode1.setNext(singlyNode2);
        singlyNode2.setNext(singlyNode3);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeFromIndex(1);
        assertEquals(3, list.getHead().getNext().getVal());
        assertEquals(2, list.getSize());
    }

    @Test
    void testRemoveFromIndexSingleElement() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        list.removeFromIndex(0);
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testRemoveFromIndexOutOfBounds() {
        SinglyNode singlyNode1 = new SinglyNode(1);
        SinglyLinkedList list = new SinglyLinkedList(singlyNode1);
        boolean result = list.removeFromIndex(5);
        assertFalse(result);
        assertEquals(1, list.getSize());
        assertEquals(1, list.getHead().getVal());
        assertEquals(1, list.getTail().getVal());
    }

    @Test
    void testEmptyListInitialization() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void testAddFirstOnEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyNode node = new SinglyNode(10);
        list.addFirst(node);
        assertEquals(1, list.getSize());
        assertEquals(10, list.getHead().getVal());
        assertEquals(10, list.getTail().getVal());
    }

    @Test
    void testAddLastOnEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyNode node = new SinglyNode(20);
        list.addLast(node);
        assertEquals(1, list.getSize());
        assertEquals(20, list.getHead().getVal());
        assertEquals(20, list.getTail().getVal());
    }

    @Test
    void testAddAtIndexOnEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyNode node = new SinglyNode(30);
        boolean result = list.addAtIndex(0, node);
        assertTrue(result);
        assertEquals(1, list.getSize());
        assertEquals(30, list.getHead().getVal());
        assertEquals(30, list.getTail().getVal());
    }

}
