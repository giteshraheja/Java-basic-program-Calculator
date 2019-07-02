// Suggested by diksha
class Node {
    int data;
    Node previous;
    Node next;

    Node(int val) {
        this.data = val;
    }
}

class LinkedList {
    Node start;

    void push(int val) {
        Node node = new Node(val);
        if (start == null) {
            start = node;
        }
        else{
            start.previous = node;
            node.next = start;
            start = node;
        }
    }

    void append(int val) {
        Node node = new Node(val);
        Node end = start;
        node.next = null;
        if (start == null) {
            node.previous = null;
            start = node;
            return;
        }
        while (end.next != null) {
            end = end.next;
        }
        end.next = node;
        node.previous = end;
    }

    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Node can't be null");
            return;
        }
        Node node = new Node(data);
        node.next = prevNode.next;
        prevNode.next = node;
        node.previous = prevNode;
        if (node.next != null)
            node.next.previous = node;
    }

    void delete(Node startRef, Node del) {
        if (start == null || del == null)
            return;
        if (start == del)
            start = del.next;
        if (del.next != null)
            del.next.previous = del.previous;
        if (del.previous != null)
            del.previous.next = del.next;
        return;
    }

    void display(Node node) {
        Node end = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println("");
        System.out.println("Traversal in backward Direction");
        while (end != null) {
            System.out.print(end.data + " ");
            end = end.previous;
        }
        System.out.println();
    }
}

class DDL {
    public static void main(String[] args) {
        LinkedList abc = new LinkedList();
        abc.push(12);
        abc.push(11);
        abc.append(13);
        abc.append(14);
        abc.display(abc.start);
        abc.delete(abc.start, abc.start.next);
        abc.display(abc.start);

    }
}

// Made by me
//public class DDL {
//    Node head; // head of the list
//
//    // double linked list node
//    class Node {
//        int data;
//        Node previous; // start of the Node
//        Node next;      // end of Node
//
//        // constructor for node. So next and previous by default null
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    // adding node to the front of the list
//    public void push(int data) {
//        Node new_node = new Node(data);
//        new_node.next = head;
//        new_node.previous = null;
//        if (head != null) {
//            head.previous = new_node;
//        }
//        head = new_node;
//    }
//
//    // given a node as prev_node, insert a new node after the given node
//    public void insert_After(Node prev_node, int data) {
//        if (previous == null) {
//            System.out.println("The Given Previous Node can't be null");
//            return;
//        }
//        Node new_node = new Node(data);
//        new_node.next = prev_node.next;
//        prev_node.next = new_node;
//        new_node.previous = prev_node;
//        if (new_node.next != null)
//            new_node.next.previous = new_node;
//    }
//
//
//    public void append(int data) {
//        Node new_Node = new Node(data);
//        Node last = head;
//        new_Node.next = null;
//        if (head == null) {
//            new_Node.previous = null;
//            head = new_Node;
//            return;
//        }
//        while (last.next != null)
//            last = last.next;
//        last.next = new_Node;
//        new_Node.previous = last;
//    }
//
//
//    public void print_List(Node node) {
//        Node last = null;
//        while (node != null) {
//            System.out.print(node.data + " ");
//            last = node;
//            node = node.next;
//        }
//        System.out.println();
//    }
//
//    public void delete_Node(Node head_ref, Node del) {
//        if (head == null || del == null)
//            return;
//        if (head == del)
//            head = del.next;
//        if (del.next != null)
//            del.next.previous = del.previous;
//        if (del.previous != null)
//            del.previous.next = del.next;
//        return;
//    }
//
//}
//
//
//    public static void main(String[] args) {
//        // Didn't Entered the code
//    }
//
//}