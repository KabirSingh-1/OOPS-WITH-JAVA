package ExceptionHandling;

class kabirException extends Exception{
    kabirException(String str){
        super(str);
    }
}
public class ThrowKeywords {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0) throw new kabirException("i can't print zero");

        }catch(kabirException e){
            System.out.println("can't divide by zero"+e);
        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
