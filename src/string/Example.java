package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String str = "hello is hello how is hello";

        String str1 = Arrays.stream(str.split(" "))
                .map(word ->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(str1);





    }
}
