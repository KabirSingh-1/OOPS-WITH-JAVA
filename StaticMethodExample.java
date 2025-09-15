class MathUtil {
    // Static method
    static int square(int x) {
        return x * x;
    }

    // Instance method
    int cube(int x) {
        return x * x * x;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        // Calling static method without creating an object
        System.out.println("Square of 5: " + MathUtil.square(5));
        // For non-static methods, object is required
        MathUtil util = new MathUtil();
        System.out.println("Cube of 5: " + util.cube(5));
    }
}
