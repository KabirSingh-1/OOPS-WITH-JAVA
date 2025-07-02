// 1.  To refer to parent class instance variable

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println("color from super class: "+super.color);  // White
    }
}

// 2.  To invoke parent class method
class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("Dog eats");
    }

    void printEat() {
        super.eat();  // Calls parent class method
    }
}


//3.To invoke parent class constructor

class Animal2 {
    Animal2(String name) {
        System.out.println("Animal constructor: " + name);
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super("Bruno");  // Must be the first statement
        System.out.println("Dog constructor");
    }
}



public class SuperKeyword {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.printColor();
        Dog1 obj2 = new Dog1();
        obj2.eat();
        obj2.printEat();
        Dog2 obj3 = new Dog2();
        
    }
}
