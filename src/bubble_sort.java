public class bubble_sort {
    // Bubble Sort:
    public static void bubbleSort(int[] arr){

        int n = arr.length;

        /*
        Number of Pass is (n-1) because the last pass has only one
        element left, which is already the smallest one so no need
        to run a next pass for only one element.
         */
        for(int pass = 0; pass < (n - 1); pass++){


            // In each pass, each element get sorted
            for(int index = 0; index < (n-1-pass); index++){

                if(arr[index] > arr[index+1])
                {
                    // Swap:
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
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

        display(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        display(arr);
    }
}
