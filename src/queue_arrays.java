class Queue{
    int size;
    int front;
    int rear;
    int[] arr;

    // Watch Lec. 39 For Full Explanation:
    Queue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    // Is Empty:
    public boolean isEmpty(){
        if((front == -1 && rear == -1) || front == rear){
            return true;
        }

        return false;
    }

    // Is Full:
    public boolean isFull(){
        if(rear == size-1){
            return true;
        }
        return false;
    }

    // Enqueue: OR Insertion At Rear(End):
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Array already full");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    // Dequeue: Remove from Front:
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Array is already empty");
            return;
        }

        front++;
    }

    // Display OR Traverse:
    public void display(){
        // Front is at the value which we removed:
        for(int index = front+1 ; index <= rear; index++){
            System.out.print(arr[index] + " ");
        }
    }
}

// Explanation:
/*
==> Traditional One Variable Method:
By using the traditional method in which we use one variable (head/top/front),
the time complexity of queue will be O(n) because after dequeue we will have
to change the index of all elements.

==> New Two Variable Method:
The time complexity in this method will be O(1) becuase we don't change add
or remove values, we just change the position of "rear" at insertion and "front"
at deletion.
*/

public class queue_arrays {
    public static void main(String[] args){

        Queue queue = new Queue(7);

        // Engueue:
        queue.enqueue(28);
        queue.enqueue(15);
        queue.enqueue(32);
        queue.enqueue(54);
        queue.enqueue(12);

        // Dequeue:
        queue.dequeue();

        // Display:
        queue.display();
    }
}
