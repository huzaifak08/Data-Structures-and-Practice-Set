public class rhombus_pattern {
    public static void main(String[] args){

        // _____******
        // ____******
        // ___******
        // __******
        // _******
        // ******

        for(int row=1; row<=6; row++){

            // Spaces:
            for(int index=1; index<= 6-row; index++){
                System.out.print(" ");
            }

            // Stars:
            for(int index=1; index<= 6; index++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
