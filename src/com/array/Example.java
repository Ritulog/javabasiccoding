package array.com.kunal.lecture;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 5, 3, 2, 4, 2};
        for(int i=0; i<arr.length; i++){
            boolean isUnique = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(arr[i]);
            }
        }




    }

}
