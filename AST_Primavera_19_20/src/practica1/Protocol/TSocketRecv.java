package practica1.Protocol;

import ast.protocols.tcp.TCPSegment;
import utils.Channel;

public class TSocketRecv {

    private final Channel channel;

    public TSocketRecv(Channel channel) {
        this.channel = channel;
    }

    public int receiveData(byte[] data, int offset, int length) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");      
        int readBytes = 0;
        TCPSegment seg = channel.receive();
        
        int offset2 = seg.getDataOffset();
        int length2 = seg.getDataLength();
        byte[] data2 = seg.getData();
        //The if else does exactly the same as 
        //readBytes = length2 < length ? length2 : length; 
        
        /*
        if(length2 < length){
            System.arraycopy(data2, offset2, data, offset, length2 );
            readBytes = length2;
        }else{
            System.arraycopy(data2, offset2, data, offset, length );
            readBytes = length;
        }*/
        
        readBytes = length2 < length ? length2 : length;   
        System.arraycopy(data2, offset2, data, offset, readBytes );        
        return readBytes;
    }
}
