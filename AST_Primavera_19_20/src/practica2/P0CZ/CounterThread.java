package practica2.P0CZ;

public class CounterThread extends Thread {

    public static int x;
    private final int I = 1000;

    @Override
    public void run() {
        int R;
        for (int i = 0; i < I; i++) {
//            x = x + 1; //-> a 1800 comença a fallar
            R = x;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {

            }
            R = R + 1;
            x = R;
        }
    }
}
