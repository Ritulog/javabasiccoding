package string;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "character";

        // Create a HashMap to store character counts
        Map<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // Update the count in the map
            System.out.println(c);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Print the result
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
