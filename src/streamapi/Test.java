package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + age;
    }
}
 class Testing{

    public static void main(String[] args) {
        List<Test> people = Arrays.asList(
                new Test("ritu", 10),
                new Test("Rdahika", 50),
                new Test("garima", 90),
                new Test("manish", 80),
                new Test("sunu", 10)
        );

        List<Test> list = people.stream().sorted(Comparator.comparingInt(p->p.age)).collect(Collectors.toList());
        List<Test> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(p -> p.age))
                .collect(Collectors.toList());
        System.out.println(sortedByAge);

    }
}
