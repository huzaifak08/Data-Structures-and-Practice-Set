import java.util.Arrays;

public class second_largest_num {
    public static int findSecondLargerNum(int[] arr){
        int secondToLarger;

         Arrays.sort(arr);

         // Add a check of array greater than 2
        if(arr.length >= 2){
            secondToLarger = arr[arr.length - 2];
        }else{
            return 0;
        }

        return secondToLarger;
    }

    public static void main(String[] args){
        int[] arr = {9,3,7,7,6,1,4,2,3};

       int value =  findSecondLargerNum(arr);
        System.out.println("Second Largest Element: "+ value);

    }
}
