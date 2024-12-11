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
    }
}
