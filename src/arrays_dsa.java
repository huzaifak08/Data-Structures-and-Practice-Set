public class arrays_dsa {
    public static void display(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println("Index: " + index + " Element: " + arr[index]);
        }
    }

    // Insertion at any Index:
    public static int insertion(int[] arr,int size, int insertAt, int element, int capacity) {
        if (size >= capacity) {
            return -1;
        }

        for (int index = size-1 ; index >= insertAt; index--) {
            arr[index+1] = arr[index];
        }

        arr[insertAt] = element;

        return 1;
    }

    // Insertion at End:
    public static int insertionAtEnd(int[] arr,int size, int element, int capacity) {
        if (size >= capacity) {
            return -1;
        }
        arr[size] = element;

        return 1;
    }

    // Delete Index:
    public static int deletion(int[] arr,int size, int deleteAt, int capacity) {
        if (size >= capacity || deleteAt >= size) {
            return -1;
        }

        for(int index = (deleteAt+1); index < capacity; index++){
            arr[index-1] = arr[index];
        }

        display(arr);

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[7];

     //   {4, 10, 18, 25, 30};

        arr[0] = 4;
        arr[1] = 10;
        arr[2] = 18;
        arr[3] = 25;
        arr[4] = 30;

        display(arr);

//        int value = insertion(arr, 5,2, 8, arr.length);
        System.out.println("Is inserted: " );

//        int value = insertionAtEnd(arr,5,77,arr.length);
        int value =  deletion(arr,5,2,arr.length);
        System.out.println("Is Deleted: "+ value);
//        display(arr);

    }
}