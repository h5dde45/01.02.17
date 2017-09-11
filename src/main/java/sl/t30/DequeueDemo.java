package sl.t30;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque
                <String> deque=new ArrayDeque<>();
        deque.add("1");
        deque.add("2");
        System.out.println(deque.add("3"));
        System.out.println(deque.offer("4"));

        System.out.println(deque);

        deque.addFirst("first");
        deque.addLast("last");
        System.out.println(deque);

        deque.push("push1");
        deque.push("push2");
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);

    }
}
