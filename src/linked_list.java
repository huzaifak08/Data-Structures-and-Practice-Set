class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head = newNode;
        } else {
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        int currentPosition = 0;
        Node current = head;
        Node previous = null;

        while (current != null && currentPosition < position) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if (currentPosition < position) {
            System.out.println("Position Exceed list length");
        }

        previous.next = newNode;
        newNode.next = current;

    }

    public void insertAfter(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        int currentPosition = 0;
        Node current = head;
        Node previous = null;

        while (current != null && currentPosition < (position + 1)) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if (currentPosition < (position + 1)) {
            System.out.println("Position Exceed list length");
        }

        previous.next = newNode;
        newNode.next = current;

    }

    public void insertArrayAtBeginning(int[] arr) {

        // Output for this will be: 40 30 20 10 2 4 8 9
        for (int index = 0; index < arr.length; index++) {
            insertAtBeginning(arr[index]);
        }

        // Traverse in reverse Order: 10 20 30 40 2 4 8 9
        for (int index = (arr.length - 1); index >= 0; index--) {
            insertAtBeginning(arr[index]);
        }
    }

    // Delete Operation:
    public void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAt(int position) {
        if (position == 0) {
            deleteHead();
            return;
        }

        Node previous = null;
        Node current = head;
        int currentPosition = 0;

        while (current.next != null && currentPosition < position) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        previous.next = current.next;
    }

    public void deleteAtEnd() {
        if (head.next == null) {
            deleteHead();
            return;
        }

        Node previous = null;
        Node current = head;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
    }

    public void deleteAtData(int data) {
        if (head.data == data) {
            deleteHead();
            return;
        }

        Node previous = null;
        Node current = head;

        while (current.data != data) {
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}

public class linked_list {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // ====================> INSERT OPERATIONS:

        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(9);

//      list.insertAtBeginning(88);
//      list.insertAt(1,1);
//      list.insertAfter(99,1);

        int[] arr = {10, 20, 30, 40};
//      list.insertArrayAtBeginning(arr);

        // ====================> DELETE OPERATIONS:

//          list.deleteHead();
//          list.deleteAt(3);
//          list.deleteAtEnd();
        list.deleteAtData(4);

        // ====================> DISPLAY OPERATIONS:
        list.display();

    }
}
