public class triangle_pattern {
    public static void main(String[] args){

        // ____*
        // ___*_*
        // __*_*_*
        // _*_*_*_*
        // *_*_*_*_*

        for(int row =1; row<=5; row++){
            for(int index=1; index<=5-row; index++){
                System.out.print(" ");
            }

            for(int index=1; index<=row; index++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
