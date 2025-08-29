package Polymorphism;
class Calculator{
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }

}
public class CompileTime {
     public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 3));
        System.out.println(cal.add(1.2, 3.4));
     }
    
}
 // use method overloading -  Same method name, different parameters