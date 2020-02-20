package practica1.CircularQ;

import java.util.Iterator;

public class TestCQ {

    public static void main(String[] args) {
        //This is just an example.
        int N = 6;
        int i;
        CircularQueue<Integer> queue = new CircularQueue<Integer>(N);
        for(i = 0; i < N; i++){
            queue.put(i);
        }
        System.out.println(queue);
        System.out.println(queue.full());
        int num = queue.get();
        System.out.println(queue);
        queue.size();
        queue.free();
        queue.hasFree(1);
        queue.hasFree(5);
        int num2 = queue.peekLast();
        System.out.println(queue);
        for(i = 0; i < N; i++){
            queue.put(0);
        }
        System.out.println(queue);
        System.out.println(queue.empty());
    }
}
