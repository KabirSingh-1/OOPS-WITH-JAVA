class car{
    int speed;
    String color;

    car(int speed, String color){
        this.speed = speed;
        this.color = color;
        System.out.println("speed of a car: "+speed);
        System.out.println("color of a car: "+color);
    }

    void drive(){
        System.out.println("drive function ");
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        car obj = new car(100, "black");
        obj.drive();
    }
}