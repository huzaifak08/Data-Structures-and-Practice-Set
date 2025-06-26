public class ps_27_remove_dup_of_value {
    public static int removeElement(int[] nums, int val) {

        int i =0;
        for (int index = 0; index < nums.length; index++){
            if(nums[index] != val){
                nums[i] = nums[index];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums,val);
        System.out.println("Result: "+ result);
    }
}
