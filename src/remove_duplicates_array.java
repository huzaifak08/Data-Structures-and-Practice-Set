public class remove_duplicates_array {

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }

        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args){
        int[] array = {1,1,2};
       int result = removeDuplicates(array);

        System.out.println("Result: "+result);
    }
}
