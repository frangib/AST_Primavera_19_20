package practica1.LinkedQ;

import java.util.Iterator;

public class TestLQ {

    public static void main(String[] args) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        int i;
        
        System.out.println("*****************************");
        System.out.println("**Current state of the queue*");
        System.out.println("*****************************");
        System.out.println("Size: " + queue.size());
        System.out.println("Empty: " + queue.empty());
        System.out.println("Full: " + queue.full());
        System.out.println("Has free 50: " + queue.hasFree(50));
        System.out.println();
        
        System.out.println("*****************************");
        System.out.println("Try to peekFirst and peekLast");
        System.out.println("*****************************");
        try{
        System.out.println(queue.peekFirst());
        }catch(Exception ex){
            System.out.println("You can't peekFirst if the queue is empty!");
        }
        
        try{
        System.out.println(queue.peekLast());
        }catch(Exception ex){
            System.out.println("You can't peekLast if the queue is empty!");
        }
        
        System.out.println("*****************************");
        System.out.println("*Put 10 numbers in the queue*");
        System.out.println("*****************************");
        for(i = 0 ;i < 10 ; i++){
            queue.put(i);
        }
        System.out.println();
        
        System.out.println("*****************************");
        System.out.println("**Current state of the queue*");
        System.out.println("*****************************");
        System.out.println("Size: " + queue.size());
        System.out.println("Empty: " + queue.empty());
        System.out.println("Full: " + queue.full());
        System.out.println("Has free 50: " + queue.hasFree(50));
        System.out.println();
        
        
        System.out.println("*****************************");
        System.out.println("Try to peekFirst and peekLast");
        System.out.println("*****************************");
        try{
        System.out.println(queue.peekFirst());
        }catch(Exception ex){
            System.out.println("You can't peekFirst if the queue is empty!");
        }
        
        try{
        System.out.println(queue.peekLast());
        }catch(Exception ex){
            System.out.println("You can't peekLast if the queue is empty!");
        }
        System.out.println();
        
    }
}
