package arrays.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void findDuplicate(int[] arr){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
      //  System.out.println("Duplicate elements are"+duplicate);
        duplicate.forEach(e->System.out.println("duplicate element is"+e));
    }

    //using for loop
    public static void duplicate(int[] arr){
        int[] visited= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(visited[arr[i]] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break;
                    }
                }

            }
            visited[arr[i]]++;
        }
    }

    // Remove duplicate
    static void findD(int[] arr){
        Arrays.sort(arr);
        int idx =0;
        for(int i=1; i< arr.length; i++) {
            boolean unique = true;
            if (arr[i] == arr[i - 1]) {
                arr[idx++] = arr[i];
                unique = false;
               break;

            }
        }
            for(int i=0; i<idx; i++) {
                System.out.println(arr[i]);
            }


    }

    public static void main(String[] args){
        int[] arr={1,2,2,3,4,5,3,2,4,2};
       // duplicate(arr);
        //  findDuplicate(arr);
        findD(arr);
    }
}
