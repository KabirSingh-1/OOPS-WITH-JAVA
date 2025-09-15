package Inner_AnonymousClasses.AnonymousClass;

public class AnonymousClasswithThreads {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println("thread");
            }
        };
        t.start();
        Thread t1 = new Thread(new Runnable() {
            public void run(){
               System.out.println("runable implementation by thread");
            }
        });
        t1.start();
    }
}
