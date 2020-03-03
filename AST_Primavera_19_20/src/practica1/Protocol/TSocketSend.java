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
        //FIXME:ASK ALFONSO HOW TO INITIALIZE THE BYTE ARRAY.
        byte[] aux = new byte[99999];
        TCPSegment seg = new TCPSegment();
        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        //TODO: Check what the destPos is. Is it the same offset?
        System.arraycopy(data, offset, aux, offset, length);
        seg.setData(aux);
        channel.send(seg);
    }
}
