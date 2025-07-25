package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamSortingObjects {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        // Sorting by age in ascending order
        List<Person> sortedByAge = people.stream()
                                         .sorted(Comparator.comparingInt(p -> p.age))
                                         .collect(Collectors.toList());

        System.out.println("Sorted by Age: " + sortedByAge);
    }
}
