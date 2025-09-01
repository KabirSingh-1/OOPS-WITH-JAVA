package Constructor.ConstructorChaining;
class Student{

    Student(){
        System.out.println("I am Super class Constructor");
    }
}
class Boy extends Student{
    Boy(){
        super();
        System.out.println("I am sub class Constructor");
    }
}
public class UseSuper {
    public static void main(String[] args) {
        Boy b = new Boy();
    }
}
