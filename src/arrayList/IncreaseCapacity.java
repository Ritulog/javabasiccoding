package arrayList;

import java.util.ArrayList;

public class IncreaseCapacity {
    public static void main(String[] args) {
        ArrayList<String> c1=new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("black");
        System.out.println("Orignal array list: "+c1);

        //Increase capacity to 6;
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: "+c1);
        c1.add(0,"hhh");

        //Print using index of an element
        for(int i=0; i<c1.size()-1; i++)
        {
            System.out.println(c1.get(i));
        }

    }
}
