package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseSort {
    public static void main(String[] args) {
        int[] array={5,6,7,2,1,8,9};
        //only reverse the array, but not sort in reverse order
        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
        System.out.println("using strean api");
        Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
