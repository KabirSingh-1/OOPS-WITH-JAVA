package Inheritance;
class animal1{
    public void eat(){
        System.out.println("eat");
    }
}
class dog extends animal1{
    public void bark(){
        System.out.println("bark");
    }
}
public class Animal {
    public static void main(String[] args) {
        dog d =new dog();
        d.eat();
        d.bark();
    }
}
