package arrays.array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the element");
        int[] arr=new int[5];
//        arr[0] =23;
//        arr[1] =45;
//        arr[2] =233;
//        arr[3] =543;
//        arr[4]=3;
        //[23,45,233,543,3]
        //System.out.println(arr[3]);

//        //input using for loops
//        for(int i=0; i< arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        //print using for loop
//        for(int i=0; i< arr.length; i++){
//           System.out.print(arr[i]);
//        }

        //print using enhence for loop
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
            //here num represets element of the array
        }
        System.out.println(Arrays.toString(arr));
 //System.out.println(arr[5]); //index out of bound error

        //array of objects
        String[] str=new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
