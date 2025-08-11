class car1{
    int speed;
    String color;

    car1(int speed, String color){
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
        car1 obj = new car1(100, "black");
        obj.drive();
    }
}