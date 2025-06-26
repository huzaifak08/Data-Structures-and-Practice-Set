public class ps_09_palindrome {

    // palindrome Method:
    public static boolean isPalindrome(int x){
        // convert x into string;
        String xString = Integer.toString(x);

        // Create an array;
        int[] arr = new int[xString.length()];

        for(int index = 0; index < xString.length(); index++){
            arr[index] = Character.getNumericValue(xString.charAt(index));
        }

        // Create a temp array:
        int[] tempArr = new int[xString.length()];

        // Traverse the original array in reverse order
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[arr.length - 1 - i]; // Copy elements in reverse order
        }

        // Now compare the two arrays:
        boolean result = areArraysEqual(arr,tempArr);

        return result;
    }

    // Are arrays Equal Method:
    public static boolean areArraysEqual(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }

        for(int index = 0; index < array1.length; index++){
            if(array1[index] != array2[index]){
                return false;
            }
        }

        return true;
    }

    // ============== Optimized code for is Palindrome: =================
    public static boolean isPalindromeOptimized(int x){
        if(x < 0){
            return false;
        }

        String xString = Integer.toString(x);

        String reverseString = new StringBuilder(xString).reverse().toString();

        return xString.equals(reverseString);
    }
    // Main Method:
    public static void main(String[] args){
        System.out.println("Is Palindrome: "+ isPalindrome(10));
        System.out.println("Is Palindrome: "+ isPalindromeOptimized(121));
    }
}
