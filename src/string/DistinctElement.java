package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctElement {
    public static void main(String[] args) {
        String str="madammi";
        distinctChar(str);
        distict(str);
        Scanner s=new Scanner(System.in);
        System.out.println("enter  a string");
        String input=s.nextLine();


        HashSet<Character> distinct= new HashSet<>();
        //Map<Integer, String> map = new HashMap<>();
        for(char findDis:input.toCharArray()){
            distinct.add(findDis);
        }
       System.out.println("Distinct element is"+distinct);

    }
    //using loop
    public  static void distict(String str){

        //outer loop picks each character
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            boolean isUnique = true;
          for(int j=0; j<str.length(); j++){
              if(i !=j && ch==str.charAt(j)){
                  isUnique = false;
                  break;
              }
          }
          if(isUnique){
              System.out.println( ch +" ");
          }

        }
    }

    //using Hashmap
    public static void distinctChar(String str){
        HashMap<Character, Integer> charCount=new HashMap<Character,Integer>();

        //Count occurences of each element
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) +1);
        }
        //print charracters that appear only once
        System.out.println("Non-repeated charcter: ");
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(charCount.get(ch)==1){
                System.out.println(ch +" ");
            }
        }
    }
}
