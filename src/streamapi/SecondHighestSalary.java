package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(5000, 7000, 6000, 7000, 8000, 8000, 9000);

        Optional<Integer> secondHighest = salaries.stream()
                .distinct()                      // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                          // Skip the highest
                .findFirst();                     // Get the second highest

        secondHighest.ifPresent(salary ->
                System.out.println("Second highest salary: " + salary));

    }
}
