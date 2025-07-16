class A{
    public void show() {
        System.out.println("in show");
    }
}
public class AnonumousInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            public void show() {
                System.out.println("in anonymous class");
            }
        };
        a.show();
    }
}
