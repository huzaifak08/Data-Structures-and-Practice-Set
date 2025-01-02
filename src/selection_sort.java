public class selection_sort {
    public static void selectionSort(int[] arr){

        int n = arr.length;

        for(int pass = 0; pass < (n-1); pass++){
            int min = pass;

            // Iterate through each index:
            for(int index = pass+1; index <= n-1; index++){

                if(arr[min] > arr[index]){
                    min = index;
                }
            }

            // Swap:
            int temp = arr[pass];
            arr[pass] = arr[min];
            arr[min] = temp;
        }
    }

    public static void display(int[] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {8, 0, 7, 1, 3};

        display(arr);
        selectionSort(arr);
        display(arr);
    }
}
