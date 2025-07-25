package string;

import java.util.HashMap;

public class MinOccCharater {
        public static void main(String[] args) {
            String input = "allisallwell"; // Input string
            findMinOccurringCharacter(input);
        }

        public static void findMinOccurringCharacter(String str) {
            // Create a HashMap to store character frequencies
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            // Count occurrences of each character
            for (char c : str.toCharArray()) {
                if (Character.isWhitespace(c)) continue; // Ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Initialize variables to find minimum occurring character
            char minChar = '\0';
            int minCount = Integer.MAX_VALUE;

            for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() < minCount) {
                    minCount = entry.getValue();
                    minChar = entry.getKey();
                }
            }

            // Output result
            if (minChar != '\0') {
                System.out.println("Minimum occurring character: " + minChar);
                System.out.println("Occurrences: " + minCount);
            } else {
                System.out.println("No characters found.");
            }
        }
    }


