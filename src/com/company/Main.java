package com.company;

public class Main {

    public static void main(String[] args) {
        fourStars();
        rightAngleTriangle();
        leftTriangle();
        pyramid();

    }

    private static void fourStars() {
        int row=4;
        // loop for the first row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void rightAngleTriangle(){
        int i,j, row=6;
        //row iteration
        for (i=0;i<row;i++){
            //inner loop for columns
            for (j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    private static void leftTriangle(){
        int i,j, row=6;
        //row iteration
        for (i=0;i<row;i++){
            //inner for work space
            for(j=2*(row-i);j>=0; j--){
                System.out.print(" ");
            }
            for (j=0;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pyramid(){
        int i,j, row=6;
        for (i=0; i<row;i++){

            //inner loop
            for (j=row-i;j>1; j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
