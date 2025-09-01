package Inner_AnonymousClasses;
class A{
    private String message = "I am Kabir";
    class B{
        void show(){
            System.out.println(message);
        }
    }
}
public class NonStaticInner {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.show();
        
    }
}
