import java.util.Stack;

public class parentheses_order {

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack();

        for(int index = 0; index < str.length(); index++){

            if(str.charAt(index) == '('){
                stack.push(')');
            } else if (str.charAt(index) == '{') {
                stack.push('}');
            } else if (str.charAt(index) == '[') {
                stack.push(']');
            }else {
                if(stack.isEmpty() || stack.peek() != str.charAt(index)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String input = "]";
        boolean result = isValid(input);
        System.out.println("Is the string valid? " + result);
    }
}
