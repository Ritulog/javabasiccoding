package objectOriProgra.alloopsexample;

class Person {
    String name;
    int age;

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {   // Single Inheritance
    String employeeId;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

// ---------- Multilevel Inheritance ----------
class Manager extends Employee {   // Multilevel (Person → Employee → Manager)
    String department;

    void showManager() {
        System.out.println("Manager of Department: " + department);
    }
}

// ---------- Hierarchical Inheritance ----------
class Developer extends Employee {  // Hierarchical (Employee → Manager / Developer / Tester)
    String programmingLanguage;

    void showDeveloper() {
        System.out.println("Developer in: " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    void showTester() {
        System.out.println("Tester uses: " + testingTool);
    }
}

// ---------- Multiple Inheritance (via Interface) ----------
interface Trainer {
    void train();
}

class TechLead extends Developer implements Trainer {  // Class + Interface
    public void train() {
        System.out.println("Tech Lead is training juniors.");
    }
}

// ---------- Hybrid Inheritance (Class + Interface mix) ----------
interface ProjectWork {
    void projectDetails();
}

class ProjectManager extends Manager implements ProjectWork {
    public void projectDetails() {
        System.out.println("Managing Banking Project.");
    }
}

// ---------- Main Class ----------
public class InheritanceTypesExample {
    public static void main(String[] args) {

        // Single Inheritance
        Employee e = new Employee();
        e.name = "Rahul";
        e.age = 28;
        e.employeeId = "E101";
        e.showDetails();
        e.showEmployee();

        System.out.println("-------------------------");

        // Multilevel Inheritance
        Manager m = new Manager();
        m.name = "Priya";
        m.age = 35;
        m.employeeId = "M201";
        m.department = "HR";
        m.showDetails();
        m.showEmployee();
        m.showManager();

        System.out.println("-------------------------");

        // Hierarchical Inheritance
        Developer d = new Developer();
        d.name = "Amit";
        d.age = 25;
        d.employeeId = "D301";
        d.programmingLanguage = "Java";
        d.showDetails();
        d.showDeveloper();

        Tester t = new Tester();
        t.name = "Sneha";
        t.age = 27;
        t.employeeId = "T401";
        t.testingTool = "Selenium";
        t.showDetails();
        t.showTester();

        System.out.println("-------------------------");

        // Multiple Inheritance (via Interface)
        TechLead lead = new TechLead();
        lead.name = "Vikram";
        lead.age = 30;
        lead.employeeId = "TL501";
        lead.programmingLanguage = "Spring Boot";
        lead.showDetails();
        lead.showDeveloper();
        lead.train();

        System.out.println("-------------------------");

        // Hybrid Inheritance
        ProjectManager pm = new ProjectManager();
        pm.name = "Ritu";
        pm.age = 33;
        pm.employeeId = "PM601";
        pm.department = "IT";
        pm.showDetails();
        pm.showManager();
        pm.projectDetails();
    }
}
