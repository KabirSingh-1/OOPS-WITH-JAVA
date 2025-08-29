package Abstraction;
abstract class car{
    public abstract void drive(); // declear a method instead of defining
    public abstract void fly();
    public void playMusic(){ // define a method
        System.out.println("play music");
    }
}

abstract class WagonR extends car{
    

    public void drive(){
        System.out.println("drive");
    }
}

class UpdatedWagonR extends WagonR{
      public void fly(){
        System.out.println("fly");
      }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

//1. can't create a object of abstract class 
//2. if there is abstract method it should be abstract class compulsory  
//3 .if there is abstract class so maybe or maybe not a abstract method or more than one abstract method can allow but the abstact method should be declear not define in abstact class 