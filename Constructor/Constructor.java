package Constructor;
//1. default Constructor 
class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 101;
        name = "Kabir";
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

//2.  Parameterized Constructor
class Employee {
    int id;
    String name;

    // Parameterized Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}
//3. copy Constructor - Java does not support copy constructors like C++ directly, but we can simulate it.
class Book {
    String title;

    // Parameterized constructor
    Book(String title) {
        this.title = title;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
    }

    void display() {
        System.out.println("Title: " + title);
    }
}

//  Private Constructor
class Singleton {
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Object created");
    }

    // Static method to access object
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        Employee obj1 = new Employee(100, "kabir");
        obj1.show();
        Book b1 = new Book("Java Mastery");
        Book b2 = new Book(b1);  // Copying object
        b1.display();
        b2.display();
        Singleton s1 = Singleton.getInstance();  // Allowed
        Singleton s2 = Singleton.getInstance();  // Same object returned
    }
}
