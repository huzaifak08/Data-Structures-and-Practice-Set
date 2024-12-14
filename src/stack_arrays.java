class Stack {
    int size;
    int top;
    int[] arr;

    Stack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return  false;
    }

    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        return  false;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Already empty");
            return 0;
        }

        int valueToReturn = arr[top];

        arr[top] = 0;
        top--;
        return valueToReturn;
    }

    public int peek(int position){
        if((top - position)+1 < 0){
            return -1;
        }

        return arr[((top-position)+1)];
    }

    public void display(){
//        for(int index=0; index<arr.length; index++){
//            System.out.println(arr[index]);
//        }

        // Reverse Traversing for Display Stack:
        for(int index = top; index >=0; index--){
            System.out.println(arr[index]);
        }
    }
}



public class stack_arrays {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Checking Stack is Empty:::
        boolean value = stack.isEmpty();

        if(value == true){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }

        // Checking Stack is not Empty:
        boolean val = stack.isFull();

        if(val == true){
            System.out.println("Stack is Full");
        }else{
            System.out.println("Stack is not Full");
        }

        // Push:
        stack.push(8);
        stack.push(9);
        stack.push(10);

        // Pop:
//        int result = stack.pop();
//        System.out.println("Poped Value from stack is: "+ result);

        // Peek:
        int peekValue = stack.peek(3);
        System.out.println("Peek Value: "+ peekValue);

        // Traverse:
        stack.display();
    }
}
