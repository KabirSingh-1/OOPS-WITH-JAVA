package Constructor.ConstructorChaining;
class Student{
    String name;
    int age;
    Student(){
        this("kabir",18);  // chaining to param constructor
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println(name+" "+age);
    }
}
public class UseThis {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
