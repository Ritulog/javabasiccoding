package com.array;

public class RemoveDuplicatesManual {
    public static void main(String[] args) {
        //int[] arr1 = {1, 2, 2, 3, 4, 5, 3, 2, 4, 2};
        int[] arr1={1,2,3,4,5,5,7,7,9};
        int n = arr1.length;

        int[] temp = new int[n];  // To store unique elements
        int size = 0;             // Count of unique elements

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr1[i] is already in temp
            for (int j = 0; j < size; j++) {
                if (arr1[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to temp
            if (!isDuplicate) {
                temp[size] = arr1[i];
                size++;
            }
        }

        // Print the result
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
