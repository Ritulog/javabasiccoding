package streamapi;

import java.util.*;

public class FilterNanme {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ritu","Manish","Anita");

        names.stream().filter(n->n.startsWith("R")).forEach(System.out::println);

        int[] arr = {9,2,2,3,18,4,5,18,24};

        // Integer obj
        Optional<Integer> secondHighest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighest);

        //primitive int
        OptionalInt secondHighest1 = Arrays.stream(arr).distinct().sorted().skip(arr.length -2).findFirst();
        System.out.println(secondHighest1);


    }
}
