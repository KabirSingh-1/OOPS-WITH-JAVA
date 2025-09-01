package interface_1;
interface Computer{
    public void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code ,compile,run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code , compile,run: fast");
    }
}

class Developer {
    public void  devApp(Computer lap){
        lap.code();
    }
}
public class NeedInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer kabir = new Developer();
        kabir.devApp(lap);
        kabir.devApp(desk);
    }
}