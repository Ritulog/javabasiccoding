package arrays.lambda;

import java.util.*;

public class QuestionsSort {
     // without lambda
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ritu", "Manish", "Anita");

//        Collections.sort(list, new Comparator<String>(){
//            @Override
//                    public int compare(String a, String b){
//                  return  a.compareTo(b);
//            }
//        });



        // with Lamda
        Collections.sort(list, (a,b) ->a.compareTo(b));

        list.forEach(n-> System.out.println(n));

    }
}
