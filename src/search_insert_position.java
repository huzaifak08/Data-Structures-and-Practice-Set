public class search_insert_position {

    public static int searchInsert(int[] nums, int target) {
        Boolean isMatchFound = false;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] == target){
                isMatchFound = true;
                return index;
            }
        }

        if(isMatchFound != true){
            System.out.println("Here");
            for(int index = 0; index < nums.length; index++){

                // Start Index:
                if(index == 0 && nums[index] > target){
                    return index;
                }

                // End Index:
                if(nums[index] < target && index == nums.length -1){
                    return index+1;
                }

                if(nums[index] < target && nums[index + 1] > target){
                    return index + 1;
                }
            }
        }

        return -1;
    }

    public static int searchInsertOpt(int[] nums, int target) {
        int low = 0;             // Initialize the lower bound of the search range
        int high = nums.length - 1; // Initialize the upper bound of the search range

        // Standard binary search loop: continue as long as the lower bound
        // is less than or equal to the upper bound.
        while (low <= high) {
            // Calculate the middle index to avoid potential integer overflow
            // that (low + high) / 2 might cause if low and high are very large.
            int mid = low + (high - low) / 2;

            // Case 1: Target is found at the middle index
            if (nums[mid] == target) {
                return mid; // Return the index where the target is found
            }
            // Case 2: Target is greater than the middle element
            // This means the target must be in the right half of the current search range.
            else if (nums[mid] < target) {
                low = mid + 1; // Move the lower bound to mid + 1
            }
            // Case 3: Target is less than the middle element
            // This means the target must be in the left half of the current search range.
            else { // nums[mid] > target
                high = mid - 1; // Move the upper bound to mid - 1
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        int result = searchInsert(arr,0);
        System.out.println(result);
    }
}
