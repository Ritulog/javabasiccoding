package arrays.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargest {
    public static int getThirdLargestEle(int[] arr, int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++)
            {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
            }
        }
       // return arr[1]; //for 2nd smallest eleny
        return  arr[total-3]; //a[total-2]
    }
    //2nd Approch
    public static int getThirdLargest(int a[], int total){
        Arrays.sort(a);
        return a[total-3];
    }
    //3rd Approch using collection
    public static int getThird(Integer a[], int total){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-3);
        return element;
    }

    //4th approch using stream api
    public static int thirdLargestEle(int[] a){
        int thirdLarget= Arrays.stream(a).distinct().sorted().skip(a.length-4).findFirst().orElseThrow();
        return thirdLarget;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,45};
        Integer[] arr1={1,2,3,4,5,6,3,45};
       //System.out.println(getThirdLargestEle(arr,8));
       System.out.println(getThirdLargest(arr,8));
      // System.out.println(getThird(arr1,8));
      // System.out.println("using stream api");
      // System.out.println(thirdLargestEle(arr));


    }
}
