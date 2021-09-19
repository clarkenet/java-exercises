package com.company.datastructure;

public class CustomLinkedList {
    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public String print() {
        if (head == null) {
            return "Empty";
        }
        Node temp = head;
        StringBuilder sb = new StringBuilder("[" + temp.value);
        temp = temp.next;
        while (temp != null) {
            sb.append(", ").append(temp.value);
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return true;
    }

    public boolean reverseIterative() {
        //Cannot perform the operation
        if (head == null) {
            return false;
        }
        //Not need to reverse since it is only one element
        if (head.next == null) {
            return true;
        }
        Node prev, temp, next;
        prev = null;
        temp = head;
        next = head.next;
        while (temp.next != null) {
            temp.next = prev;
            prev = temp;
            temp = next;
            next = next.next;
        }
        temp.next = prev;
        head = temp;
        return true;
    }

    public boolean reverseRecursive() {
        //Cannot perform the operation
        if (head == null) {
            return false;
        }
        //Not need to reverse since it is only one element
        if (head.next == null) {
            return true;
        }
        reverseHelper(head, null);
        return true;
    }

    private void reverseHelper(Node node, Node prev) {
        if (node.next == null) {
            node.next = prev;
            head = node;
            return;
        }
        reverseHelper(node.next, node);
        node.next = prev;
    }

    public int iterativeSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int recursiveSize() {
        return recursiveSizeHelper(head);
    }

    private int recursiveSizeHelper(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + recursiveSizeHelper(node.next);
    }

    //Causes a cyclic List
    public boolean makeCyclic() {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return true;
    }

    public boolean isCyclic() {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Integer getFromEnd(int n) {
        if (head == null || n > iterativeSize()) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        int start = 1;
        while (fast.next != null) {
            fast = fast.next;
            start++;

            if (start > n) {
                slow = slow.next;
            }
        }
        return slow.value;
    }
}
