class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;


    public LinkedList(){
        head = null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        if(head != null){
            newNode.next = head;
            head = newNode;
        }else{
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int data, int position){
        if (position == 0){
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        int currentPosition = 0;
        Node current = head;
        Node previous = null;

        while (current != null && currentPosition < position){
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if(currentPosition < position){
            System.out.println("Position Exceed list length");
        }

        previous.next = newNode;
        newNode.next = current;

    }

    public void insertAfter(int data, int position){
        if (position == 0){
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        int currentPosition = 0;
        Node current = head;
        Node previous = null;

        while (current != null && currentPosition < (position+1)){
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if(currentPosition < (position+1)){
            System.out.println("Position Exceed list length");
        }

        previous.next = newNode;
        newNode.next = current;

    }

    public void display(){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}

public class linked_list {
    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(9);

        list.insertAtBeginning(88);

//        list.insertAt(1,1);

        list.insertAfter(99,1);


        list.display();

    }
}
