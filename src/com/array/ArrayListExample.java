package array.com.kunal.lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element");
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(70);
//        list.add(71);
//        list.add(72);
//        System.out.println(list.contains(67));
//        System.out.println(list);
         for(int i=0; i<5; i++){
             list.add(in.nextInt());
         }

         //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index gere, list[index] syntax will not work
        }
        System.out.println(list);
    }
}
