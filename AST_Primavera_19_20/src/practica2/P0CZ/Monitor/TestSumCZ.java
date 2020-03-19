package practica2.P0CZ.Monitor;

public class TestSumCZ {

    public static void main(String[] args) throws InterruptedException {
       // throw new RuntimeException("Aquest mètode s'ha de completar...");
        MonitorCZ mon = new MonitorCZ();
        CounterThreadCZ counter1 = new CounterThreadCZ(mon);
        CounterThreadCZ counter2 = new CounterThreadCZ(mon);
        counter1.start();
        counter2.start();
        
        counter1.join();
        counter2.join();
        
        System.out.println("Final value of x: " + mon.getX());
    }
}
