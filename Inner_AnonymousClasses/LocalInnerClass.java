package Inner_AnonymousClasses;
class Person{
    void greet(){
        String name = "Kabir";
        class greeter{
            void sayHi(){
                System.out.println("Hello "+name);
            }
        }
         new greeter().sayHi();

    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        new Person().greet();
    }
}
