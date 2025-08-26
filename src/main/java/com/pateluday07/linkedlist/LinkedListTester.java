package  com.pateluday07.linkedlist;

public class LinkedListTester {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        LinkedList linkedList = new LinkedList(node1);

        Node n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());

        System.out.println("\nAdd at First");
        Node node0 = new Node(0);
        linkedList.addFirst(node0);

        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());

        System.out.println("\nAdd at Last");
        Node node5 = new Node(5);
        linkedList.addLast(node5);

        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());

        System.out.println("\nAdd at index");
        Node nodeAtIndex = new Node(0);
        linkedList.addAtIndex(2, nodeAtIndex);

        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());

        System.out.println("\nRemove First Node");
        linkedList.removeFirst();
        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());

        System.out.println("\nRemove Last Node");
        linkedList.removeLast();
        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());


        System.out.println("\nRemove From Index");
        linkedList.removeFromIndex(3);
        n = linkedList.getHead();
        while (n != null) {
            System.out.println(n.getVal());
            n = n.getNext();
        }

        System.out.println("Head: " + linkedList.getHead().getVal());
        System.out.println("Tail: " + linkedList.getTail().getVal());
        System.out.println("Size: " + linkedList.getSize());
    }

}
