package ch11;

import java.util.*;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        // 큐 인터페이스 구현체인 링크드 리스트를 사용
        Queue q = new LinkedList();

        st.push("st0");
        st.push("st1");
        st.push("st2");

        q.offer("q0");
        q.offer("q1");
        q.offer("q2");

        System.out.println("= Stack =");
        while(!st.isEmpty())
            System.out.println(st.pop());

        System.out.println("= Queue =");
        while(!q.isEmpty())
            System.out.println(q.poll());
    }
}
