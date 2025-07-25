package arrayList;

import java.util.ArrayList;

public class CloneArraylist {
    public static void main(String[] args) {
        ArrayList<String> c1=new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Originial array list: "+c1);
        ArrayList<String> newc1=(ArrayList<String>)c1.clone();
        System.out.println("cloned array list: "+newc1);

        System.out.println("Original array list is empty or not "+c1.isEmpty());
        //c1.removeAll(c1);
       // System.out.println("Original array list is empty"+c1.isEmpty());
        c1.trimToSize();
        System.out.println(c1);


    }
}
