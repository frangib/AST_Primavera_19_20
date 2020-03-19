package practica2.P1Sync.Monitor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MonitorSync {

    private final int N;
    //Completar....
    private ReentrantLock l; 
    private Condition notMyTurn;
    private int turn;
    

    public MonitorSync(int N) {
        this.N = N;
        l = new ReentrantLock();
        notMyTurn = l.newCondition();
        turn = 0;
    }

    public void waitForTurn(int id) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        l.lock();
        try {
            while(turn != id){
                notMyTurn.awaitUninterruptibly();
            }
        } finally {
            l.unlock();
        }
    }

    public void transferTurn() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        l.lock();
        try {
            turn = (turn +1)%N;
            /*
            Aquí habia que usar el singalAll() porque el signal()
            podría despertar un proceso que no sea al que le toca.
            */
            notMyTurn.signalAll();
        } finally {
            l.unlock();
        }
    }
}
