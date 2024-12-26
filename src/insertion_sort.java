
public class insertion_sort {
    // Insertion Sort:
    public static void insertionSort(int[] arr) {
        int key, index;

        for(int pass = 0; pass < arr.length; pass++){
            key = arr[pass];
            index = pass - 1;
            System.out.println("Key: "+key+ " --> Index: "+ index);

            while (index >= 0 && arr[index] > key){
                System.out.println("Arr[index]: "+ arr[index]);
                arr[index+1] = arr[index];
                index--;
            }

            arr[index+1] = key;
        }
    }

    // Display:
    public static void display(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + ", ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {7, 4, 35, 28, 1};
//        int[] arr = {2,3,4,5,6,8};

        display(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println();
        display(arr);
    }
}