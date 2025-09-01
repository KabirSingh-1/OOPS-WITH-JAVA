package ExceptionHandling;
public class TryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j  = 0;
        int nums[] = new int[5];
        String str = null;
        try{
            j = 18/i;
            System.out.println(nums[5]);
            System.out.println(str.length());
            
        }catch(ArithmeticException e){
            System.out.println("can't devided by zero: "+e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("index out of bound: "+e);
        }
        catch(Exception e){
            System.out.println("something went wrong: "+e);
        }
        System.out.println(j);
        System.out.println("bye");

    }
}
