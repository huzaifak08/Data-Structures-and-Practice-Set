public class quick_sort {
    // Quick Sort:
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
           int pivotIndex = partition(arr,low,high);

            System.out.println("Pivot Index after Partition: "+ pivotIndex);

           quickSort(arr,low, pivotIndex - 1);
           quickSort(arr,pivotIndex + 1, high);
        }
    }

    // Partition:
    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = -1;

        for(int j = 0; j < high; j++){
            i++;

            // Swap: (i and j)
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Swap: (i and pivot)
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }

    // Display:
    public static void display(int[] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }

    // Main Method:
    public static void main(String[] args){
        int[] arr = {6,1,5,3,2,4};
        int n = arr.length;

        quickSort(arr,0,n-1);
        for(int index = 0; index < n; index++){
            System.out.print(arr[index] + " ");
        }
        System.out.println();

    }
}
