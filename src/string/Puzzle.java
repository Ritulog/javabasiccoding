package string;
/*
a==b
Both point to the same string pool object
output: true

a==c
a is from the pool, c is a new object. Different references.
output : false

a.equal
 */




public class Puzzle {
    public static void main(String[] args) {
        String a = "hello";
        String b = "he" +"llo";
        String c = new String("hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
