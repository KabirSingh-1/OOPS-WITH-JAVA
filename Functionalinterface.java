//SAM(single abstract method interface)
@FunctionalInterface
interface A{
    void show(int i);
}
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class Functionalinterface {
    public static void main(String[] args) {
       A obj  = (i)-> System.out.println("in show : "+i);
        
       
       obj.show(6);
    // by anonymous inner class 
    //    A obj = new A(){
    //      public void show(){
    //         System.out.println("in show");
    //      }
    //    };
    //    obj.show(); 
    }
}
