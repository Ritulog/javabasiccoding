package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionMethod {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println("size " + values.size());

        System.out.println("ISEMPTY " +values.isEmpty());

        System.out.println("contains " + values.contains(5));
        values.add(5);
        System.out.println("contains " + values.contains(5));
        values.remove(3);
        System.out.println("remove using index " + values.contains(4));
        values.remove(Integer.valueOf(3));
        System.out.println("remove using object " + values.contains(3));
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        values.addAll(stackValues);
        System.out.println("addAll test using containsAll: " + values.containsAll(stackValues));
        values.remove(Integer.valueOf(3));
        System.out.println(" containsAll after removing 1 element " + values.containsAll(stackValues));
        values.removeAll(stackValues);
        System.out.println("removeall" + values.contains(8));
        values.clear();
        System.out.println("clear " + values.isEmpty());

    }
}
