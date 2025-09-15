public class StaticBlock {
    static int count;
    // Static block
    static {
        System.out.println("Static block executed!");
        count = 100; // initialize static variable
    }

    public static void main(String[] args) {
        System.out.println("Main method executed!");
        System.out.println("Count = " + count);
    }
}
