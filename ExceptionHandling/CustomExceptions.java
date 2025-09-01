package ExceptionHandling;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
class Voter{
    public void register(int age) throws AgeException{
        if(age<18) throw new AgeException("not eligible for vote");
        System.out.println("register successfully ");
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        Voter v = new Voter();
        try{
            v.register(16);

        }catch(AgeException e){
            System.out.println("error : "+e.getMessage());
        }
    }
}
