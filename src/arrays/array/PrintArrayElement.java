package arrays.array;

import java.util.Arrays;

public class PrintArrayElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,3,6,7};
        String[] array1={"apple", "banana", "cherry"};
        for(int i=0; i<arr.length;i++){
            System.out.println("element of the array"+ " "+arr[i]);
        }
        System.out.println("using Stream api");
        Arrays.stream(array1).forEach(System.out::println);
    }
}
