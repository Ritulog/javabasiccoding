package streamapi;

import java.util.Arrays;
import java.util.List;

public class SubtractList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 1, 1, 3, 4, 2);

        int result = list.stream()
                         .skip(1)
                         .reduce(list.get(0), (a, b) -> a - b);

        System.out.println("Subtraction result: " + result);
    }
}
