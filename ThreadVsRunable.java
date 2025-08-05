// class R implements Runnable{
//     public void run(){
//         for(int i = 0; i<=10; i++){
//             System.out.println("hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class R1 implements Runnable{
//     public void run(){
//         for(int i = 0; i<=10; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
public class ThreadVsRunable {
    public static void main(String[] args) {
        Runnable r1 = ()->{
        for(int i = 0; i<=10; i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        };
        Runnable r2 = ()->{

        for(int i = 0; i<=10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();

        t2.start();
    }
}
// a class will extend thread and thread implements runable interface which is functional interface so we can use anonymous inner class and also lambda expression 
// one more imp thing runable does't have start methoda that's why we have to make thread object and pass runnable object as parameter in thread constuctor 