package arrays.array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={1,23,5,4,38,8,99};
        int max=arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //using stream api
        int integer1= Arrays.stream(arr).max().orElseThrow();
        System.out.println(integer1);
    }
}
