package arrays.array;

public class MergeTwoArray {

    // Brute force method to merge two arrays
    public static int[] mergeArrays(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int[] merged = new int[aLen + bLen];

        // Copy elements from the first array
        for (int i = 0; i < aLen; i++) {
            merged[i] = a[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < bLen; i++) {
            merged[aLen + i] = b[i];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {7, 8, 9, 10, 11, 12};

        int[] merged = mergeArrays(a, b);

        System.out.print("Merged using brute force: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
