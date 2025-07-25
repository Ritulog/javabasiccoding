package string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondMostOccChar {
    public static void main(String[] args) {
        String str="allstatessa";
        findSecondMostOccurringCharacter(str);
    }
    public static void findSecondMostOccurringCharacter(String str) {
        // Count character occurrences using Stream API
        Map<Character, Long> charCountMap = str.chars()
                .filter(c -> !Character.isWhitespace(c)) // Ignore spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Sort characters by frequency in descending order
        List<Map.Entry<Character, Long>> sortedEntries = charCountMap.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toList());

        // Get the second most occurring character
        if (!sortedEntries.isEmpty()) {
            Map.Entry<Character, Long> secondMost = sortedEntries.get(3);
            System.out.println("Second most occurring character: " + secondMost.getKey());
            System.out.println("Occurrences: " + secondMost.getValue());
        } else {
            System.out.println("No second most occurring character found.");
        }
    }
}
