package OOPs;


class Student{
    int id;
    String name;
    int age;
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Object created succesfully.");
    }

    public void DisplayStudent(Student student){
        System.out.println("Name : " + student.name);
        System.out.println("Age : " + student.age);
    }
}
public class basic_opp {
    
    public static void main(String[] args) {

        Student s1 = new Student(01, "Hatke", 19);
        s1.DisplayStudent(s1);
    }
}
