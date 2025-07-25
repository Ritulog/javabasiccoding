package string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyStream {
    public static void main(String[] args) {
        String input = "hello is hello and how is hello";

        Map<String, Long> wordFrequency = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        wordFrequency.forEach((word, count) -> 
            System.out.println(word + " : " + count));
    }
}
