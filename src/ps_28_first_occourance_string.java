public class ps_28_first_occourance_string {

    public static int strStr(String haystack, String needle) {

        int needleLength = needle.length();

        if(needleLength > haystack.length()){
            return -1;
        }

        // Iterate through haystack:
        for(int index = 0; index < haystack.length(); index++){
            // Match first Char:
            if(haystack.charAt(index) == needle.charAt(0)){

                String remaningString = haystack.substring(index);

                if(remaningString.length() < needleLength){
                    return -1;
                }

                // Make a string from current index to needleLength index char:
                String temp = haystack.substring(index,index+needleLength);

                // Compare two strings:
                if(temp.equals(needle)){
                    return index;
                }
            }
        }
        return -1;
    }

    public static int strStrOptimized(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            return 0;
        }

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i; // Return the starting index 'i'
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = strStr("mississippi","issipi");
        System.out.println(result);
    }
}
