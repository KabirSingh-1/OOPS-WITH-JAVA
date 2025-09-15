package interface_1;

import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
       List<Integer> list = List.of(1,2,3,4,5,6,7);
       list.forEach(System.out::println);

       list.stream()
                .filter(item->item%2==0)
                .forEach(System.out::println);
              

    }
}
