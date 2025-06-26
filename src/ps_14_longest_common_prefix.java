public class ps_14_longest_common_prefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the shortest string in the array
        String shortest = strs[0];
        for (int index =1; index < strs.length; index++) {
            if (strs[index].length() < shortest.length()) {
                shortest = strs[index];
            }
        }
        System.out.println("Shortest: "+shortest);

        // Compare characters at each position
        StringBuilder result = new StringBuilder();

        // Take one first character of first String element:
        for (int charIndex = 0; charIndex < shortest.length(); charIndex++) {
            char currentChar = shortest.charAt(charIndex); // Get the current character from the shortest string
            System.out.println("Current Character: "+currentChar);

            // Compare first character with the rest of the elements in array:
            for (int index = 0; index < strs.length; index++) {
                System.out.println("String: "+ strs[index] +" ==> String Char :"+strs[index].charAt(charIndex) + " ==> Current Char: "+ currentChar);
                if (strs[index].charAt(charIndex) != currentChar) {
                    return result.toString(); // Return the result if a mismatch is found
                }
            }
            result.append(currentChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Example 1: " + longestCommonPrefix(strs1));

        // Example 2
//        String[] strs2 = {"dog", "racecar", "car"};
//        System.out.println("Example 2: " + longestCommonPrefix(strs2));
    }
}