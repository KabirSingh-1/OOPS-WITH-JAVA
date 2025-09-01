package interface_1;

interface Vehicle{
    default void start(){
        System.out.println("vehicle is start....");
    }
}
class car implements Vehicle{}
public class defaultMethods {
    public static void main(String[] args) {
        car obj = new car();
        obj.start();
    }
}
//Use Case: Add methods to existing interfaces without affecting legacy code.