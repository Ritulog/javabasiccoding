package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("String");
        list.add("Red");
        list.add("Yellow");
        list.add("white");
        list.add("black");
        System.out.println("List before suffling"+list);
        Collections.reverse(list);
        System.out.println("after reverse :"+list);
        //Collections.shuffle(list);
        //System.out.println("list after shuffle"+list);

        //Create a list and add some colors to the list
        List<String> sub_list1=list.subList(0,3);
        System.out.println("sublist :"+sub_list1);
    }
}
