class Student{
    String name; // Instance variable (separate copy for each object)
    static String college = "ABC College";  // Static variable (shared)

    Student(String name){
        this.name = name;
    }
    void Display(){
        System.out.print(name+": ");
        System.out.println(college);
    }
}
public class StaticVariableExample {
    public static void main(String[] args) {
        Student s1= new Student("kabir");
        Student s2 = new Student("nandini");
        s1.Display();
        s2.Display();

        // Changing static variable through class name
        Student.college = "XYZ College";

        s1.Display();
        s2.Display();
    }
}
