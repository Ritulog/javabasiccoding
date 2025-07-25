package string;

import java.util.Arrays;

public class WordLength {
    public static void main(String[] args) {
        String input = "hello is hello and how is hello";

        // Print each word with its length
        Arrays.stream(input.split(" "))
                .distinct() // Optional: to avoid repeating the same word
                .forEach(word -> System.out.println(word + " : " + word.length()));
    }
}
