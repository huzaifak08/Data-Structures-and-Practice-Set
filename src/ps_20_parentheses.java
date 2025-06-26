public class ps_20_parentheses {

    public static char toBeSearched(char bracket){
        if(bracket == '(' ){
            return ')';
        } else if (bracket == '{' ) {
            return '}';
        } else if (bracket == '[' ) {
            return ']';
        }else return 'f';
    }

    public static boolean isValid(String str){
        for(int index = 0; index < str.length(); index++){

            char element = str.charAt(index);
            char toSearch = toBeSearched(element);

            if(toSearch == 'f'){
                break;
            }else{
                System.out.println("Bracket is correct");

                int j = index+1;

                boolean matchFound = false;
                while (j < str.length()){
                    if(str.charAt(j) == toSearch){
                        matchFound = true;
                        break;
                    }else{
                        j++;
                    }
                }

                if(!matchFound){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args){
       boolean result = isValid("([])");
        System.out.println("Result: "+ result);
    }
}
