package arrays.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        /*
          1 2 3
          4 5 6
          7 8 9
 */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element :");
//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//
//        int[][] arr2 = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9},
//        };
        //input
        int[][] arr = new int[3][2];
      // System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            //  arr1[i] = in.nextInt();
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                //System.out.print(arr[row][col] +" ");
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//        // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                // arr[row][col]=in.nextInt();
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        //output
        for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //output
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

