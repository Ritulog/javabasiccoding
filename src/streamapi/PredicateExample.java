package streamapi;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Check if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
    }
}
