class A{
    int age;
    public void show(){
      System.out.println("in show");
    }

   static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class InnerClass {
   public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // A.B obj1 = obj.new B(); // b is non-static class
        A.B obj1 = new A.B(); // b is static class

        obj1.config();
   } 
}
// inner class can be static but outer can't be static (Illegal modifier for the class A; only public, abstract & final are permitted)