public class hollow_square_pattern {
    public static void main(String[] args){
        for (int row=1; row<=4; row++){
            for(int index=1; index<=4; index++){

                if((row ==2 && (index ==2 || index == 3)) || (row ==3 && (index ==2 || index == 3))){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }


            }
            System.out.println();
        }
    }
}
