package basic;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome number: "+temp);
        }
        else{
            System.out.println("not palindrome: "+temp);
        }

        int number = 121; // Change this to test other numbers
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }
    //using stream api
    public static boolean isPalindrome(int number){
        String original = String.valueOf(number);
        String reversed = IntStream.range(0, original.length())
                .mapToObj(i -> original.charAt(original.length() - i - 1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return original.equals(reversed);
    }
}
