public class last_word_length {
    public static int lengthOfLastWord(String s) {
        // Initial variables:
        int count = 0;

        // Trim:
        String newStr = s.trim();

        // One char case:
        if(newStr.length() == 1){
            return 1;
        }

        // Iterate through new string in reverse:
        for(int index = newStr.length() -1 ; index >= 0; index--){
            System.out.println("Index: "+index+ " Char: "+newStr.charAt(index));

            if(index == 0){
                count++;
                return count;
            }

            // if current char is not space then increment count:
            if(newStr.charAt(index) == ' '){
                return count;
            }

            count++;
        }
        return -1;
    }

    public static int lengthOfLastWordOpt(String s) {
        int length = 0; // Initialize length of the last word
        int i = s.length() - 1; // Start iterating from the end of the string

        // Step 1: Skip any trailing spaces
        // We move the pointer 'i' backwards past any spaces at the end of the string.
        // Example: "Hello World   " -> 'i' will move from the last space to 'd'
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count the length of the last word
        // Now, 'i' is pointing to the last character of the last word (or -1 if string was all spaces).
        // We continue moving 'i' backwards as long as it's within bounds AND the character is NOT a space.
        // Each non-space character encountered is part of the word, so we increment 'length'.
        // Example: "World" (from the previous step's 'd') -> 'd', 'l', 'r', 'o', 'W'
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        // Step 3: Return the calculated length
        // 'length' now holds the count of characters in the last word.
        // If the string was empty or contained only spaces, 'length' will remain 0.
        return length;
    }

    public static void main(String[] args){
        int result = lengthOfLastWord("   day");

        System.out.println(result);
    }
}
