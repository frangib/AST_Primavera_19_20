package practica1.Protocol;

import practica1.CircularQ.CircularQueue;
import ast.protocols.tcp.TCPSegment;
import utils.Channel;

public class QueueChannel implements Channel {

    //Completar...
    private CircularQueue<TCPSegment> queue;

    public QueueChannel(int N) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        queue = new CircularQueue<>(N);
    }

    @Override
    public void send(TCPSegment s) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        //TODO: Ask alfonso si tenemos que hacer copia de s
        queue.put(s);
    }

    @Override
    public TCPSegment receive() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return queue.get();
    }

    @Override
    public int getMSS() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //TODO: ASK ALFONO WHAT MSS SHOULD WE USE. By now we're going to use
        //ipv6 MSS for testing.
        return 1220;
    }
}
