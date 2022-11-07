package Q2;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int arraySize = 5;

        int[][] spiralArray = new int[arraySize][];
         int count = 0;
        for (int i = 0; i < arraySize; i++) {
            spiralArray[i] = new int[i];

            for (int j = 0; j < i; j++) {
                spiralArray[i][j] =count++;
                System.out.println(Arrays.toString(spiralArray[i]));

            }
        }
       /* for (int index = 0; index < 5;index++ ){
            System.out.print(index + "  ");
             for (int j = 0;j <5;j++ ){
                 System.out.println(index + "  ");
             }
        }*/
    }
}
