package com.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array1={1,5,3,7,8,2};
        int temp;
        for(int i=0; i<array1.length; i++){
            for(int j=i+1; j<array1.length; j++){
                if(array1[i]>array1[j]){
                    temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
            }
            System.out.println(array1[i]);
        }
        System.out.println("sorted array");
        Arrays.stream(array1).sorted().forEach(System.out::println);
        Arrays.sort(array1);
        System.out.println("sorted array"+Arrays.toString(array1));
    }
}
