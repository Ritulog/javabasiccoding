package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AddElemnts {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Red");
        list.add("blue");
        list.add("orange");
        list.add("voilet");

        //Add at specific position
        list.add(0,"Pink");
        list.add(5,"yellow");

        //retreve element
        String element=list.get(0);
        System.out.println("retrive element :"+element);

        //update element
        String element1=list.set(2, "yellow");
        System.out.println(element1);

        System.out.println(list);
        //remove 3rd element
        list.remove(3);
       Iterator<String>list1= list.iterator();
       while(list1.hasNext()){
           System.out.println(list1.next());
       }

       for(String ch:list){
           System.out.println();
       }

       //search element
        if(list.contains("Red")){
            System.out.println("Found the element");
        }
        else{
            System.out.println("the element not found");
        }

        //sort the given arraylist
        Collections.sort(list);
        System.out.println("List after sort :"+list);


    }
}
