package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {

        // {a=[apple, avocado], b=[banana, blueberry]}
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry");

        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(grouped);


        /*
        find the frequency of each word in a List
        input: ["apple", "banana", "apple", "mango"]
        output{aaple = 2, banana=1, mango =1}
         */

        List<String> wordss = Arrays.asList("apple", "banana", "apple", "mango");

        Map<String, Long> frequencyMap = wordss.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(frequencyMap);
    }
}
