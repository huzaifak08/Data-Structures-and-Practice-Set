public class ps_66_plus_one {
    public static int[] plusOne(int[] digits) {
        int digit = arrayToInteger(digits);

        digit++;

        int[] digitsArray = integerToArray(digit);

        return digitsArray;
    }

    public static int arrayToInteger(int[] arr){
        int result = 0;

        for(int index =0 ; index < arr.length; index++){
            result = result*10 +arr[index];
        }
        return result;
    }

    public static int[] integerToArray(int num){
        String strNum = Integer.toString(num);

        int[] array = new int[strNum.length()];

        for(int index = 0; index < strNum.length(); index++){
            // Convert to Integer:
            char temp = strNum.charAt(index);

            int value = Character.getNumericValue(temp);

            array[index] = value;
        }
        return array;
    }

    public static int[] plusOneOpt(int[] arr){
        for(int index = arr.length -1; index >= 0; index--){
            System.out.println("Index: "+index+" Element: "+ arr[index]);
            if(arr[index] < 9){
                arr[index]++;
                return arr;
            }else{
                System.out.println("Here");
                arr[index] = 0;
            }
        }

        // in case of [9] , [9,9] , [9,9,9]...
        int[] newArr = new int[arr.length+1];
        newArr[0] = 1;

        return newArr;
    }

    public static void main(String[] args){
        int[] arr = {9,9};

        int[] result = plusOneOpt(arr);

        for(int index = 0; index < result.length; index++){
            System.out.println(result[index]);
        }
    }
}
