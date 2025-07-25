package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(34);
        list1.add(33);
        list1.add(78);
        list1.add(8);
        list1.add(10);


        //without stream
        List<Integer> listEven=new ArrayList<>();
        for(Integer i : list1){
            if(i%2 ==0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //with stream
        Stream<Integer> stream=list1.stream();
        List<Integer> newList=stream.filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("List of even number"+newList);

        // 2.example
        Stream<Integer> stream1=list1.stream();
        List<Integer> newList2= stream1.filter(i-> i>10).collect(Collectors.toList());
        System.out.println("List of number"+newList2);

        // 3.example
        List<String> names= List.of("Ritu", "Aman", "Sakshi","Sanjay");
        List<String> newNames=names.stream().filter(e-> e.startsWith("S")).collect(Collectors.toList());
        System.out.println("new names with S Letter"+newNames);

        //4.example
        List<Integer> list3=List.of(1,3,4,2,5);
        List<Integer> multiple=list3.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println("multiplication"+multiple);

        //5.example
        int integer = list3.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min"+integer);

    }
}
