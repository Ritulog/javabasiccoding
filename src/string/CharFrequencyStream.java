package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyStream {
    public static void main(String[] args) {
        String input = "character";

        // Convert to stream, group by character, and count
        Map<Character, Long> frequencyMap = input.chars() // IntStream of char's ASCII
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        // Print the result
        frequencyMap.forEach((ch, count) ->
            System.out.println(ch + " : " + count)
        );
    }
}
