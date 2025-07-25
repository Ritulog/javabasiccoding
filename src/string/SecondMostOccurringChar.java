package string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostOccurringChar {
    public static void main(String[] args) {
        String str = "allstatessa";

        // Step 1: Count character frequencies using Stream API
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        // Step 2: Sort by frequency in descending order and collect to a list
        List<Map.Entry<Character, Long>> sortedList = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // Step 3: Get the second most frequent character
        if (sortedList.size() >= 2) {
            Map.Entry<Character, Long> secondMost = sortedList.get(1);
            System.out.println("Second most occurring character: " + secondMost.getKey() + " (Count: " + secondMost.getValue() + ")");
        } else {
            System.out.println("Not enough distinct characters to find second most frequent.");
        }


        // 2nd Approch
        // Count character frequency
        Map<Character, Long> freqMap1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Sort by frequency in descending order
        List<Map.Entry<Character, Long>> sortedList1 = freqMap1.entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toList());

        // Print second most frequent character
        if (sortedList1.size() >= 2) {
            System.out.println("Second most occurring character: " +
                    sortedList1.get(1).getKey() +
                    " (Count: " + sortedList1.get(1).getValue() + ")");
        } else {
            System.out.println("Not enough characters.");
        }

      // 3rd approach
        String str1 = "allstatessa";
        Map<Character, Integer> freqMap2= new HashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : str1.toCharArray()) {
            freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Sort entries by value in descending order
        List<Map.Entry<Character, Integer>> sortedList2 = new ArrayList<>(freqMap2.entrySet());
        sortedList2.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Step 3: Get the second most frequent character
        if (sortedList2.size() >= 2) {
            char secondMost = sortedList2.get(0).getKey();
            int count = sortedList2.get(0).getValue();
            System.out.println("Second most occurring character: " + secondMost + " (Count: " + count + ")");
        } else {
            System.out.println("Not enough distinct characters to find second most frequent.");
        }

    }
}
