class T extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class T1 extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {
       T t = new T();
       T1 t1 = new T1();
       t.start(); 
       try {
        Thread.sleep(5);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
       t1.start(); 
    }
}
