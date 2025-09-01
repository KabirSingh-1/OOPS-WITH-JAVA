package Inner_AnonymousClasses.AnonymousClass;
abstract class Animal{
    abstract void Sound();
}
public class AbstractClass {
    public static void main(String[] args) {
       Animal a = new Animal() {
        public void Sound(){
            System.out.println("Roar");
        }
       }; 
       a.Sound();
    }
}
