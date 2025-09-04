package arrays.array;

import java.util.Arrays;

public class DuplicateTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,3,2,4,2};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use two pointers
        int i = 0;
        int j = 1;

        System.out.println("Duplicates are:");
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                System.out.println(arr[i]); 
                // Skip all same duplicates
                while (j < arr.length && arr[i] == arr[j]) {
                    j++;
                }
            } else {
                i = j;
                j++;
            }
        }
    }
}
