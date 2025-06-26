public class ps_69_sqrt {
    public static int mySqrt (int x){
        if(x <= 0){
            return 0;
        }

        if(x == 1){
            return 1;
        }

        for(long index = 1; index <= x; index++){
            System.out.println("Index : "+ index + " Square: " +(index*index));
            if((index*index) > x){
                return (int) index-1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
        int result = mySqrt(1871180207);
        System.out.println(result);
    }
}
