class NodeModel{
    int data;
    Node next;

    NodeModel(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListt{
    Node head;

    public LinkedListt(){
        head = null;
    }

    // Is Empty:
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    // Insert At Beginning OR Push:
    public void push(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Remove AT First: POP
    public void pop(){

        if(isEmpty()){
            System.out.println("Empty, Nothing to POP");
            return;
        }

        head = head.next;
    }

    // Peek: For concept Lec. No. 31 --> First 6 mins.
    public int peek(int position){
        if(isEmpty()){
            System.out.println("Empty, Nothing to POP");
            return -1;
        }

        Node current = head;
        int index = 0;

        while (current.next != null && index < position-1){
            index++;
            current = current.next;
        }

        return current.data;
    }

    // Display OR Traverse:
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}

public class stack_linkedlist {
    public static void main(String[] args){
        LinkedListt linkedList = new LinkedListt();

        // Push:
        linkedList.push(7);
        linkedList.push(15);
        linkedList.push(18);
        linkedList.push(28);
        linkedList.push(888);

        // POP:
        linkedList.pop();

        // Peek:
        int peekValue = linkedList.peek(2);
        System.out.println("Peek value: "+ peekValue);

        // Display:
        linkedList.display();

    }
}
