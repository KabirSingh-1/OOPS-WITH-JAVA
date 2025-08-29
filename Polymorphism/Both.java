package Polymorphism;
class Printer{
    void print(String text){
        System.out.println("text :"+text);
    }
    void print(int num){
        System.out.println("number :"+num);
    }
}
class ColorPrinter extends Printer{
    @Override
    void print(String colorText){
        System.out.println("color text: "+colorText);
    }
}
public class Both {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.print("radhe radhe");
        obj.print(6);
        Printer obj1 = new ColorPrinter();
        obj1.print("jai shree ram");
    }
}
