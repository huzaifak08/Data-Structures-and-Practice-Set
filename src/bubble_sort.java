public class bubble_sort {
    /* Bubble Sort: is not adoptive, but we can make it adoptive
     using isSorted variable */
    public static void bubbleSort(int[] arr){

        int n = arr.length;
        boolean isSorted = true;
        /*
        Number of Pass is (n-1) because the last pass has only one
        element left, which is already the smallest one so no need
        to run a next pass for only one element.
         */
        for(int pass = 0; pass < (n - 1); pass++){

            // In each pass, each element get sorted (Comparisons)
            for(int index = 0; index < (n-1-pass); index++){

                if(arr[index] > arr[index+1])
                {
                    // Swap:
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;

                    // Sorted Flag
                    isSorted = false;
                }

                if(isSorted){
                    return;
                }
            }
        }
    }

    // Display:
    public static void display(int[] arr){
        for(int index=0; index < arr.length; index++){
            System.out.print(arr[index]+ ", ");
        }
    }

    public static void main(String[] args){
        int[] arr = {7,4,35,28,1};
//        int[] arr = {2,3,4,5,6,8};

        display(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        display(arr);
    }
}
