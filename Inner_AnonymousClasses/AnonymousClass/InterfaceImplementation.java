package Inner_AnonymousClasses.AnonymousClass;
interface Greeting{
    void sayHello();
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello(){
                System.out.println("hello form anonymous class");
            }
        };
        g.sayHello();
    }
}
