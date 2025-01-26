public class merge_sort {
    public static void conquer(int[] arr, int mid, int low, int high){

        int[] newArray = new int[high-low+1];

        int index1 = low;
        int index2 = mid+1;
        int indexX = 0;

        while (index1 <= mid && index2 <= high){
            if(arr[index1] <= arr[index2]){
                newArray[indexX] = arr[index1];
                indexX++;
                index1++;

                // Easy Implementation of above code:
                // newArray[indexX++] = arr[index1++];
            }else{
                newArray[indexX++] = arr[index2++];
            }

            // In case of one array completed:
            while (index1 <= mid){
                newArray[indexX++] = arr[index1++];
            }

            while (index2 <= high){
                newArray[indexX++] = arr[index2++];
            }

            // Copy the sorted elements back to the original array
            for(int index = 0; index < newArray.length; index++){
                arr[low + index] = newArray[index];
            }
        }
    }

    public static void divide(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;

            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conquer(arr, mid,low,high);
        }
    }

    public static void main(String[] args){
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr,0,n-1);

        // Display:
        for (int index = 0; index < n; index++){
            System.out.print(arr[index]+ ", ");
        }
        System.out.println();
    }
}
