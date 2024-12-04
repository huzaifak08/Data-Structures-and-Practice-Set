public class k_pattern {
    public static void main(String[] args){

        for(int row =1; row<=4; row++){
            for(int index =0; index<= (4 -row); index++){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int row= 2; row<=4; row++){
            for(int index = 1; index<=row; index++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
