package string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccuring {
    public static void main(String[] args) {
        String str = "allstates";
        char maxChar = getMaxOccurringChar(str);
        System.out.println("Maximum occouring charcater"+" "+maxChar);
        maxRepChar(str);
        getMaxOccurringChar(str);
        char manChar1 = getMaxOccurringChar(str);
        System.out.println("Maximum occouring charcater"+" "+manChar1);

    }
    //using map
    public static char getMaxOcurringChar(String str){
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        Map<Character,Integer> charCountMap= new HashMap<>();

        //Count occurrences of each character
        for(char ch:str.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);

        }

        //Find the maximum occuring charcter
        char maxChar='\0';
        int maxCount= 0;
        for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
         if(entry.getValue() > maxCount){
             maxCount =entry.getValue();
             maxChar =entry.getKey();
         }
        }
       return maxChar;
    }

    //2. approach
    public static void maxRepChar(String str){
        int[] arr =new int[127];
      for(int i=0; i<str.length(); i++){
          arr[str.charAt(i)] =arr[str.charAt(i)+1];
      }
      int max =-1;
      char c= ' ';
      for(int i=0; i<str.length(); i++){
          if(max<arr[str.charAt(i)]){
              max=arr[i];
              c=str.charAt(i);
          }
      }
      System.out.println("maximum repeated character is "+ c +" "+max);
    }

    //3.using stream api
    public static char getMaxOccurringChar(String str){
        if(str ==null || str.isEmpty()){
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        return str.chars() // Convert the string to an IntStream of characters
                .filter(c -> !Character.isWhitespace(c)) // Exclude whitespace
                .mapToObj(c -> (char) c) // Convert IntStream to a Stream of Characters
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by character and count
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()) // Find the entry with the minimum count
                .map(Map.Entry::getKey) // Get the character with the minimum count
                .orElseThrow(() -> new RuntimeException("Unable to determine minimum occurring character"));
  }
}
