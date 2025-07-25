package string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "madammi";

        List<Character> nonRepeatingChars = str.chars()  // IntStream of characters
                .mapToObj(c -> (char) c)  // Convert int to Character
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)  // Only characters with count = 1
                .map(Map.Entry::getKey)//Extracts only the key from each entry
                .collect(Collectors.toList());  // Collect all non-repeating characters

        System.out.println("All non-repeating characters: " + nonRepeatingChars);
    }
}
