package interface_1;

interface pritable{
    void print();
}
interface scannable{
    void scan();
}
class SmartPrinter implements pritable,scannable{

    public void print(){
        System.out.println("printing....");
    }
    public void scan(){
        System.out.println("scanning.....");
    }

}

public class MultipleInterface {
    public static void main(String[] args) {
        SmartPrinter smart = new SmartPrinter();
        smart.print();
        smart.scan();
    }
    
}
