public class ps_88_merge_sorted_array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArray = new int[n+m];

        while (i < m && j < n){
            System.out.println("Index: " + i + " and "+ j);
            System.out.println(nums1[i] + " and "+ nums2[j]);

            if(nums1[i] < nums2[j]){
                newArray[k] = nums1[i];
                k++;
                i++;
            }else{
                newArray[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m){
            System.out.println("Here 1");
            newArray[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n){
            System.out.println("Here 2");
            newArray[k] = nums2[j];
            k++;
            j++;
        }

        for(int index = 0; index < newArray.length; index++){
            System.out.print(newArray[index] + " ,");
        }
    }

    public static void main(String[] args){
        int[] num1 = {1,2,3};
        int[] num2 = {7,8,9};

        merge(num1, num1.length, num2, num2.length);
    }
}
