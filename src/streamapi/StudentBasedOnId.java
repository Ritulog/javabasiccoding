package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}


public class StudentBasedOnId {
    public static void main(String[] args) {
        List<Integer> s_id = Arrays.asList(1,12,123,67);
        Student s1 = new Student(1,"Ritu");
        Student s2 = new Student(12,"Sanjeev");
        Student s3 = new Student(67,"Jagriti");
        List<Student>  data = Arrays.asList(s1,s2,s3);

        List<Student>  data1 = s_id.stream().flatMap(
                e->data.stream().filter(d->d.getId() == e))
                .collect(Collectors.toList());

        for(Student d:data1){
            System.out.println(d.getName());
        }
    }
}
