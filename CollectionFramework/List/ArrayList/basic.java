package CollectionFramework.List.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.get(1));
        for(int i : list){
            System.out.println(i);
        }
        System.out.println();
        // remove 
        list.remove(0);
        // add at particular index

        list.add(0,5);
        list.add(1,7);
        // replace at index
        list.set(0, 9);
        list.remove(Integer.valueOf(9));
        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }



    }
}
