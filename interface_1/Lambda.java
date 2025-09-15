package interface_1;

import java.util.List;

@FunctionalInterface
interface Smart{
    int mul(int a ,int b);
}
public class Lambda {
    public static void main(String[] args) {
        Smart s = (a,b)-> a*b;
        int result = s.mul(4, 8);
        System.out.println(result);
    }
}
