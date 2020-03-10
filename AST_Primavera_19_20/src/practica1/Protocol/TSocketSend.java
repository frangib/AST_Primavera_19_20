package practica1.Protocol;

import ast.protocols.tcp.TCPSegment;
import utils.Channel;

public class TSocketSend {

    private final Channel channel;

    public TSocketSend(Channel channel) {
        this.channel = channel;
    }

    public void sendData(byte[] data, int offset, int length) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        byte[] aux = new byte[length];
        TCPSegment seg = new TCPSegment();
        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(data, offset, aux, 0, length);
        seg.setData(aux);
        channel.send(seg);
    }
}
