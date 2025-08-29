package Polymorphism;


class Animal{
    void makeSound(){
        System.out.println("some generic sound");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("meow");
    }
}
public class RunTime {
   public static void main(String[] args) {
     Animal obj = new Cat();
     obj.makeSound();
   } 
}

// method overriding  - Same method name & signature in child class, resolved at runtime.