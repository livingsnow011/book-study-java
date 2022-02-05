package ch11;

import java.util.*;


public class ArrayListEx1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        /**
         * ArrayList는 객체밖에 못 담음
         * but 컴파일러가 들어온 원시 리터럴을 => list.add(new Integer(5))로 오토박싱 해줌
         * */
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        List list2 = new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);

        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        for(int i=list2.size()-1;i>=0;i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);

    }


    static void print(List list1, List list2){
        System.out.println("list1"+list1);
        System.out.println("list2"+list2);
        System.out.println();
    }
}
