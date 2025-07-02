
// 1. To refer to current class instance variable(When local variables (e.g., constructor parameters) shadow instance variables:)

// class car{
//     int speed;
//     String color;
//     car(int speed, String color){
//         this.speed = speed;
//         this.color = color;
//     }
// }
// public class thisKeyword {
//     car obj = new car(100, "black");
// }


//. 2. To invoke current class method

// public class thisKeyword {
 
//     void show(){
//         System.out.println("show function");
//     }

//     void display(){
//         this.show();   // same as calling show()
//         System.out.println("display function");  
//     }
//     public static void main(String[] args) {
//         thisKeyword obj = new thisKeyword();
//         obj.display();
//         obj.show();
//     }
// }


// 3. To pass current object as parameter in a method/constructor

// class A {
   

//     void show(A obj) {
//         System.out.println("Object passed: ");
//     }

//     void call() {
//         show(this);  // passing current object
//     }
// }
// public class thisKeyword {

//     public static void main(String[] args) {
//         A obj = new A();
//         obj.call();
//         obj.show(obj);
//     }
// }


// 4.To invoke current class constructor Used with constructor chaining:

import javax.swing.text.html.CSS;

class Car {
    Car() {
        this(10);  // calls parameterized constructor
        System.out.println("Default constructor");
    }

    Car(int x) {
        // this(); // calls default constructor
        System.out.println("Parameterized constructor: " + x);
    }
}

public class thisKeyword {

    public static void main(String[] args) {
        Car obj = new Car();
    }
}


