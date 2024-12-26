
public class insertion_sort {
    // -1 0  1  2  3  4  5

    //    12 | 54 65 07 23 09 --> Pass:1 , Key:54, Index:0

    //    12 54 | 65 07 23 09 --> Pass:2 , Key:65, Index:1

    //    12 54 65 | 07 23 09 --> Pass:3 , Key:07, Index:2
    //    12 54 65 | 65 23 09 --> Pass:3 , Key:07, Index:1
    //    12 54 54 | 65 23 09 --> Pass:3 , Key:07, Index:0
    //    12 12 54 | 65 23 09 --> Pass:3 , Key:07, Index:0
    //    07 12 54 | 65 23 09 --> Pass:3 , Key:07, Index:0

    //    07 12 54 65 | 23 09 --> Pass:4 , Key:23, Index:3
    //    07 12 54 65 | 65 09 --> Pass:4 , Key:23, Index:3
    //    07 12 54 54 | 65 09 --> Pass:4 , Key:23, Index:2
    //    07 12 54 54 | 65 09 --> Pass:4 , Key:23, Index:1
    //    07 12 23 54 | 65 09 --> Pass:4 , Key:23, Index:-1

    //    07 12 23 54 65 | 09 --> Pass:4 , Key:09, Index:4
    //    07 12 23 54 65 | 65 --> Pass:4 , Key:09, Index:4
    //    07 12 23 54 54 | 65 --> Pass:4 , Key:09, Index:3
    //    07 12 23 23 54 | 65 --> Pass:4 , Key:09, Index:2
    //    07 12 12 23 54 | 65 --> Pass:4 , Key:09, Index:1
    //    07 09 12 23 54 | 65 --> Pass:4 , Key:09, Index:0

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

            // To place the key at its position
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