package ch11;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        List list2 = new ArrayList(list1.subList(1,4));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

    }
}
