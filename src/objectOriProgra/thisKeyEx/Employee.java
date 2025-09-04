package objectOriProgra.thisKeyEx;

class Employee {
    String name;
    Employee(){
        this("jiya");
        System.out.println("calling Another constructor");
       // this("jiya");
    }

    Employee(String name) {
        //name = name; // ❌ Wrong
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee();
        System.out.println(e.name);
    }
}
