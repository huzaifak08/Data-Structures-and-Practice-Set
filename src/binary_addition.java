public class binary_addition {
    public static String addBinary(String a, String b) {
        int length = Math.max(a.length(),b.length());

        // Pad 'a'
        while (a.length() < length) {
            a = "0" + a;
        }

        // Pad 'b'
        while (b.length() < length) {
            b = "0" + b;
        }

        int carry = 0;
        StringBuilder result = new StringBuilder();

        for(int index = length-1; index >= 0; index--){

            // Convert Char to Int:
            int digitA = a.charAt(index) - '0';
            int digitB = b.charAt(index) - '0';

            int sum = digitA + digitB + carry;

            result.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0){
            result.append(carry);
        }

        return result.reverse().toString();
    }

    // RECOMMENDED  HIGHLY:
    public static String addBinaryOpt(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 2);  // Current bit
            carry = sum / 2;         // Update carry

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args){
        String result = addBinary("11","1");
        System.out.println(result);

        String result1 = addBinaryOpt("11","01");
        System.out.println(result1);
    }
}
