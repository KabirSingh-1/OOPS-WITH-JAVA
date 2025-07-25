@FunctionalInterface
interface A {
    int add( int a ,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
    //    A obj = (int a, int b)->{
    //          return a+b;
    //       };
      A obj = (a,b)->a+b;// beauty of lambda expression `
       int result = obj.add(4, 7);
       System.out.println(result);
            
        
       
    }
}
