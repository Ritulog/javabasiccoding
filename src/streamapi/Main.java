package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "Engineering", 120000),
            new Employee("Bob", "Engineering", 135000),
            new Employee("Carol", "HR", 95000),
            new Employee("David", "HR", 99000),
            new Employee("Eve", "Sales", 115000)
        );

        // Group by department and find highest-paid employee in each
        Map<String, Employee> highestPaidByDept = employees.stream()
            .collect(Collectors.groupingBy(
                emp -> emp.department,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingInt(emp -> emp.salary)),
                    Optional::get
                )
            ));

        // Print result
        highestPaidByDept.forEach((dept, emp) -> 
            System.out.println(dept + " -> " + emp)
        );
    }
}
