// Simple Node:
class QueueNode{
    int data;
    QueueNode next;

    QueueNode(int data){
        this.data = data;
        this.next = null;
    }
}

// Linked List:
class QueueLinkedList{
    QueueNode front;
    QueueNode rear;

    public QueueLinkedList(){
        this.front = null;
        this.rear = null;
    }

    // Is Empty:
    public boolean isEmpty(){
        if(front == null){
            return true;
        };
        return false;
    }

    // Enqueue:
    public void enqueue(int data){
        QueueNode newNode = new QueueNode(data);

        // If Queue is Empty then front and rear has same value at first Node
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        newNode.next = null;
    }

    // Dequeue:
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Empty, Nothing to remove");
            return;
        }

        // If there is only one node exists:
        if(front == rear){
            front = null;
            rear = null;
            System.out.println("Successful, One Node Removed");
            return;
        }

        front = front.next;
    }

    // Traverse:
    public void display() {
        QueueNode current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class queue_linkedlist {
    public static void main(String[] args){

        QueueLinkedList linkedList = new QueueLinkedList();

        // Enqueue:
        linkedList.enqueue(22);
        linkedList.enqueue(32);
        linkedList.enqueue(28);
        linkedList.enqueue(99);

        // Dequeue:
        linkedList.dequeue();

        // Display:
        linkedList.display();
    }
}
