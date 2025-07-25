package string;

public class Stringpro {
    public static void main(String[] args) {
        String input = "india is a beautiful country";
        StringBuilder sb = new StringBuilder();
        int aCount = 1;
        for (String word : input.split("")) {
            for (char c : word.toCharArray()) {
                if (c == 'a') {
                    sb.append("@".repeat(aCount));
                    aCount++;
                }
                else{
                    sb.append(c);
                }
            }
        }
        System.out.println("Output :" + sb.toString());
    }
}
