package interface_1;
//  Can be called with InterfaceName.method().
//. Belong to the interface, not to instances

interface Multiple{
    static int mul(int x){
        return x*x;
    }
}
public class staticMethods {
    public static void main(String[] args) {
        System.out.println(Multiple.mul(5));
    }
}
