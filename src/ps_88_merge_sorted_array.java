public class ps_88_merge_sorted_array {

    // Method 1:
    public static void mergeUsingNewArray(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArray = new int[m+n];

        while (i < m && j < n){

            if(nums1[i] < nums2[j]){
                newArray[k] = nums1[i];
                i++;
            }else{
                newArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        // In case of remaining elements in nums1:
        while (i < m){
            newArray[k] = nums1[i];
            k++;
            i++;
        }

        // In case of remaining elements in nums2:
        while (j < n){
            newArray[k] = nums2[j];
            k++;
            j++;
        }

        for(int index = 0; index < newArray.length; index++){
            System.out.print(newArray[index] + " ,");
        }
    }

    // Method 2:
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int k = (m+n) -1;

        while (i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // In case of remaining elements in nums1:
        while (i >= 0){
            nums1[k] = nums1[i];
            k--;
            i--;
        }

        // In case of remaining elements in nums2:
        while (j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

        for(int index = 0; index < nums1.length; index++){
            System.out.print(nums1[index] + " ,");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        merge(num1, 3, num2, 3);
        mergeUsingNewArray(num1, 3, num2, 3);
    }
}
