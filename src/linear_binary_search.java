public class linear_binary_search {

    // Linear Search OR Traversal:
    public static void linearSearch(int[] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.println(arr[index]);
        }
    }

    // Binary Search:
    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]< target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int[] arr = {2, 33, 44, 66 ,77,  88 ,99};
        int target = 99;

//        linearSearch(arr);
       int value =  binarySearch(arr,target);
        System.out.println("The element "+ target +" found at index " + value);
    }

}
