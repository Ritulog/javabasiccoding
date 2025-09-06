package arrays.array;

import java.util.stream.IntStream;

public class OddPositionElement {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,3,4,67,3};
        for(int i=1; i<arr.length; i=i+2){
            System.out.println("odd position element"+" "+arr[i]);
        }
        IntStream.range(0,arr.length).filter(i->i%2 !=0).map(i->arr[i]).forEach(System.out::println);
    }
}
