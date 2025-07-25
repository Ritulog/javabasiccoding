package string;

import java.util.stream.Collectors;

public class NonRepeating {
        public static void main(String[] args) {
            String input = "programming";

            // Filter non-repeating characters
            String nonRepeatingCharcter=input.chars().mapToObj(c->(char)c).filter(c->input.indexOf(c)==input.lastIndexOf(c))
                    .map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Non-repeating characters: " + nonRepeatingCharcter);
        }
    }

/*
indexOf(c) finds the first occurrence of the character c in the string.
lastIndexOf(c) finds the last occurrence of the character c in the string.
 */
