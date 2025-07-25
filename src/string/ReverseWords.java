package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello Ritu how are you";

        String result = Arrays.stream(input.split(" "))
                .map(word -> reverse(word))
                .collect(Collectors.joining(" "));

        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }

    // Custom method to reverse a word
    private static String reverse(String word) {
        char[] chars = word.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
}
