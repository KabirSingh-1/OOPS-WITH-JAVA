package CollectionFramework.List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2);
        list.addFirst(4);
        list.addLast(0);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeIf(x->x%2==0);
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        LinkedList<String> animalsRemove = new LinkedList<>(Arrays.asList("cat","lion","elephant"));
        animals.removeAll(animalsRemove);
        System.out.println(animals);

    }
}
