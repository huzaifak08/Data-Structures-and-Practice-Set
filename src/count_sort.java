public class count_sort {
    // Get maximum from an array:
    public static int maximum(int[] arr, int n){
        int max = 1000;
        for(int index = 0; index < n; index++){
           if(max < arr[index]){
               max = arr[index];
           }
        }
        return max;
    }

    // Count Sort:
    public static void countSort(int[] arr, int n){
        int max = maximum(arr,n);
        int index;

        int[] count = new int[max+1];

        // Mark each entry as 0 in count:
        for(index = 0; index < n; index++){
            count[index] = 0;
        }

        // Increment at index equal to number at original array in count array:
        for (index = 0; index < n; index++){
            count[arr[index]]++;
        }

        // Place and Sort Values:
        index = 0; // for count array
        int oIndex = 0; // for original array

        while (index < max){
            if(count[index] > 0){
                arr[oIndex] = index;
                count[index]--;
                oIndex++;
            }else{
                index++;
            }
        }

    }
    public static void main(String[] args){
        int[] arr = {9,1,4,14,4,15,6};
        int n = arr.length;

        countSort(arr,n);
        for(int index = 0; index < n; index++){
            System.out.print(arr[index]+ ", ");
        }
    }
}
