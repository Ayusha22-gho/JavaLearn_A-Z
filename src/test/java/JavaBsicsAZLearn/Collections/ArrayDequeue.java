package JavaBsicsAZLearn.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

    public static void main(String args[]){

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);

        deque.offerFirst(0);
        deque.offerFirst(-1);
        deque.offerLast(4);
        deque.offerLast(5);

        deque.removeFirst();
        deque.removeLast();

        for(Integer num : deque){
            System.out.println(num);
        }
    }
}
