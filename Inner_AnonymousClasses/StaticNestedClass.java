package Inner_AnonymousClasses;
class Laptop{
    static String brand = "mac";
    static class Specs{
        void display(){
            System.out.println("Brand: "+brand);
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Laptop.Specs specs = new Laptop.Specs();
        specs.display();
    }
}
