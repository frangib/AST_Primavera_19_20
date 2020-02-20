package practica1.CircularQ;

import java.util.Iterator;

public class TestCQ {

    public static void main(String[] args) {
        //This is just an example.
        int N = 9;
        int i;
        CircularQueue<Integer> queue = new CircularQueue<>(N);
        
        System.out.println("Size: " + queue.size());
        System.out.println("Free: " + queue.free());
        
        for(i = 0; i < N+3; i++){
            System.out.println("Has " + i + " positions available? " + queue.hasFree(i));
        }
        
        System.out.println("Empty? " + queue.empty());
        System.out.println("Full? " + queue.full());
        
        
        //**************FILL THE QUEUE***************
        System.out.println();
        System.out.println("NOW WE FILL THE QUEUE.");
        System.out.println();
        
        for(i = 0; i < N; i++){            
            queue.put(i);
        }
        
        System.out.println("Free: " + queue.free());
        System.out.println("Empty? " + queue.empty());
        System.out.println("Full? " + queue.full());
        
        System.out.print("|");
        for(i = 0; i < N; i++){
            /*
            This loop prints the head element and then "gets" it. Thus, at the
            end of the loop the queue is empty.
            */
            System.out.print(""+queue.peekFirst()+"|");
            queue.get();
        }
        System.out.println();
        
        System.out.println("Free: " + queue.free());
        System.out.println("Empty? " + queue.empty());
        System.out.println("Full? " + queue.full());

        
        //**************FILL THE QUEUE AGAIN**********
        System.out.println();
        System.out.println("NOW WE FILL THE QUEUE AGAIN.");
        System.out.println();
        
        for(i = 0; i < N; i++){            
            queue.put(i);
        }
        
        System.out.println("Free: " + queue.free());
        System.out.println("Empty? " + queue.empty());
        System.out.println("Full? " + queue.full());
        
        System.out.print("|");
        for(i = 0; i < N; i++){
            /*
            This loop prints the head element and then "gets" it. Thus, at the
            end of the loop the queue is empty.
            */
            System.out.print(""+queue.peekFirst()+"|");
            queue.get();//Removes head element every iteration
        }
        System.out.println();
        
        System.out.println("Free: " + queue.free());
        System.out.println("Empty? " + queue.empty());
        System.out.println("Full? " + queue.full());
        
    }
}
