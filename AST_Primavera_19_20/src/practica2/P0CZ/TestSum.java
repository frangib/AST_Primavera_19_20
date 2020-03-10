package practica2.P0CZ;

public class TestSum {

    public static void main(String[] args) throws InterruptedException {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        CounterThread counter1 = new CounterThread();
        CounterThread counter2 = new CounterThread();
        counter1.start();
        counter2.start();
        
        counter1.join();
        counter2.join();
        
        System.out.println("Final value of x: " + CounterThread.x);
    }
}
