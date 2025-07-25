package string;

/*Input: s1 = “abcd”, s2 = “cdab”
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2. */
public class CheckTwoStringAreRotations {
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        String s3 = s1 + s1;
        System.out.println(s3);

        return s3.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean check = areRotations(s1,s2);
        System.out.println(check);


    }
}
