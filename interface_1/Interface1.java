package interface_1;
//class - class -> extends
//class - interface -> implement
//interface - interface -> extends


interface A{ // interface basically desing and we have to implement by other class 
   int age = 40; // always final and static 
   String area = "noida";
   void show();  // always public abstract
   void config();
   
}
interface C{
    void play();
}

interface x{
    void run();

}
interface y extends x{

}
class B implements A,C,y{ //if we fail to implement then the class become abstract class and one class can implement multiple inteface but abstract can't
     public void show(){
       System.out.println("in show");
     }

     public void config(){
      System.out.println("in config");
     }

     public void play(){
        System.out.println("in play");
     }

     public void run(){
        System.out.println("run");
     }
}
public class Interface1 {
public static void main(String[] args) {
      A obj = new B();
      obj.show();
      obj.config();
      x obj1 =new B();
      obj1.run();
      System.out.println(A.age);
      System.out.println(A.area);

   }
}
