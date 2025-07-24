package com.array;

import java.util.HashSet;

public class RemoveDuplicate {
    //without second array
    public static void removeDuplicate(int[] arr){
        int j=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        for(int i=0; i<j+1; i++){
            System.out.println(arr[i]);
        }
    }

    //with Hashset
    public static void removeDuplicacy(int a[])
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i< a.length; i++){
            hs.add(a[i]);
        }
        for(int duplicate:hs){
            System.out.println("duplicate element"+duplicate+" ");
        }
    }
    public static void main(String[] args) {
        // for sorted array
        int[] a={1,2,3,4,5,5,7,7,9};
        int[] arr1={1,2,2,3,4,5,3,2,4,2};
        int[] arr={9,4,1,2,3,4,5,5,7,7,9};
        //for unsorted and sorted both array
        //removeDuplicacy(arr);
        //calling function
        removeDuplicate(arr1);

//        int[] temp=new int[a.length];
//        int j=0;
//        for(int i=0; i<a.length-1; i++){
//            if(a[i] !=a[i+1]){
//                temp[j]=a[i];
//                j++;
//            }
//        }
//        temp[j] = a[a.length-1];
//        j++;
//        for(int i=0; i<j; i++){
//            System.out.print(temp[i]+" ");
//        }
    }
}


