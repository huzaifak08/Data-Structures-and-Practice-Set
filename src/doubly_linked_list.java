class DoublyNode{
    int data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    DoublyNode head;

    DoublyLinkedList(){head = null;}

    public void insertAtBeginning(int data){
        DoublyNode node = new DoublyNode(data);

        if(head != null){
            node.next = head;
            head = node;
            head.prev = null;
        }else{
            head = node;
            head.prev = null;
        }
    }

    public void insertAtEnd(int data){
        DoublyNode node = new DoublyNode(data);

        if(head == null){
            insertAtBeginning(data);
            return;
        }

        DoublyNode current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = node;
        node.prev = current;
    }

    public void display() {
        DoublyNode current = head;

        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        while (current != head){
            System.out.print(current.data + " ");
            current = current.prev;
        }
    }
}

public class doubly_linked_list {
    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();

//        linkedList.insertAtBeginning(2);
//        linkedList.insertAtBeginning(3);
//        linkedList.insertAtBeginning(4);

        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.display();
    }
}
