package streamapi;

import java.util.Arrays;
import java.util.List;

public class MultiplyListElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 2, 1, 1, 3, 4, 2);

        //product
        int product = list1.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of all elements: " + product);

        //sum
        int sum1 = list1.stream()
                .reduce(0, Integer::sum);

        System.out.println("sum of all elements: " + sum1);

        //sum
        int sum = list1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(" Sum: " + sum);

        //even number sum
        int evenSum = list1.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("even sum"+evenSum);

        //odd number sum
        int oddSum = list1.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("odd sum"+oddSum);
    }
}
