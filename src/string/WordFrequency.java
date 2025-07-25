package string;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "hello is hello and how is hello";

        // Split the string into words
        String[] words = input.split(" ");

        // Create a map to store frequency
        Map<String, Integer> freqMap = new HashMap<>();

        // Count the frequency
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print the result
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
