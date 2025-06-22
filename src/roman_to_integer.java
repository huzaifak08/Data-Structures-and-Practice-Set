public class roman_to_integer {
    public static int romanToInt(String s) {

        int result = 0;

        for(int index = 0; index < s.length(); index++){
            int value = getInteger(s.charAt(index));

            // If it is not the last element in string
            if(index+1 != s.length()){
                int nextValue = getInteger(s.charAt(index+1));
                if(value >= nextValue){
                    result = result+value;
                }else{
                    // if current value is less than next, then sub next from current and add in result
                    result = result + (nextValue - value);
                    index++;
                }
            }else{
                result = result + value;
            }
        }
        return result;
    }

    public static int getInteger(char ch){
        int result = 0;
        switch (ch){
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
        }
        return  result;
    }

    public static void main(String[] args){
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
