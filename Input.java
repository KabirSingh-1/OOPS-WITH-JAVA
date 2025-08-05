import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("enter the number");
        // print a - 97
        // int num = System.in.read();
        // System.out.println(num);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num1 = Integer.parseInt(bf.readLine());
        System.out.println(num1);


    }
}
