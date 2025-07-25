package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounting {
    public static void main(String[] args) {
        String str="hello is hello and how is hello";
        String data= Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);
        System.out.println(data);


        String str1="hello isabc hello and how isabc hello isabc";
        String data1 = Arrays.stream(str1.split(" "))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry<String, Long>::getValue)
                        .thenComparing(Map.Entry.comparingByKey())) // Compare by key if values are the same
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(data1);

    }

}
