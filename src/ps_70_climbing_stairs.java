public class ps_70_climbing_stairs {

    public static int climbStairs(int n){
        if(n == 1 || n==2){
            return n;
        }

        int prev1 = 2;
        int prev2 = 1;

        for(int index = 3; index <= n; index++){
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args){
        int result = climbStairs(10);
        System.out.println(result);
    }
}
