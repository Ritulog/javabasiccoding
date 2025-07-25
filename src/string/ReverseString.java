package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str="RituKumari";
        String rev =" ";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("String is palindrome"+rev);
        }
        else{
            System.out.println("Not Palindrome"+rev);
        }

        //using stream api
        List<Character> charList=str
                .chars() // gives IntStream
                .mapToObj(c->(char) c). //→ converts it to Stream<Character>
                collect(Collectors.toList()); // → groups by character and counts occurrences

        //Reverse the list of character
        Collections.reverse(charList);

        //convert the list back to a string
        String reversed = charList.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println("original String: "+str);
        System.out.println("reversed String: "+reversed);


        // 3rd. approch

        String reversed1 = Arrays.stream(str.split(""))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join("", list);
                        }
                ));

        System.out.println(reversed1); // Output: iramuKutir

    // 4th approch

        String reversed3 = new StringBuilder(str)
                .reverse()
                .toString();

        System.out.println(reversed3); // Output: iramuKutir





    }
}
