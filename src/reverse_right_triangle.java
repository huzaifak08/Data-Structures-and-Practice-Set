public class reverse_right_triangle {
    public static void main(String[] args){

        for(int row =1; row<=5; row++){

            for(int index =0; index<= (5-row); index++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
