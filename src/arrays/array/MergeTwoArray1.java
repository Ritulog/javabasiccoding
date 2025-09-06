package arrays.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray1 {
    public static void mergeArrays(int[] a, int[] b){
        int a_len=a.length;
        int b_len=b.length;
        int c_len=a_len+b_len;
        int[] c=new int[c_len];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length +i]=b[i];
        }
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={7,8,9,10,11,12};
        mergeArrays(a,b);
        System.out.println();
        System.out.println("using stream api");
        int[] result = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();

        System.out.println(Arrays.toString(result));

    }
}
