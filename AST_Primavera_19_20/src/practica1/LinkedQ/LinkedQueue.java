package practica1.LinkedQ;

import java.util.Iterator;
import utils.Queue;

public class LinkedQueue<E> implements Queue<E> {

    //Completar...
    private Node<E> firstNode;
    private int numElems;
    
    public LinkedQueue(){
        firstNode = null;
        /*
        Does the a linked queue need to have at least one node?
        */
        numElems = 0;
    }


    @Override
    public int size() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return numElems;
    }

    @Override
    public int free() {
        throw new UnsupportedOperationException("Not applies");
    }

    @Override
    public boolean hasFree(int n) {
        throw new RuntimeException("Aquest mètode s'ha de completar...");
        //Isn't this always true for a linked list?
        //TODO
    }

    @Override
    public boolean empty() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return numElems == 0;
    }

    @Override
    public boolean full() {
        throw new RuntimeException("Aquest mètode s'ha de completar...");
        //Isn't this always false for a linked list?
        //TODO
    }

    @Override
    public E peekFirst() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");       
        return firstNode.getValue();
    }

    @Override
    public E peekLast() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        int i;
        Node<E> aux = firstNode;
        //TODO: Most likely, this needs to be implemented using the iterator.
        for(i = 0; i < numElems; i++){
            aux = firstNode.getNext();
        }
        return aux.getValue();
    }

    @Override
    public E get() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        Node<E> aux;
        
        
    }

    @Override
    public void put(E value) {
        throw new RuntimeException("Aquest mètode s'ha de completar...");
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator {

        //Completar

        @Override
        public boolean hasNext() {
            throw new RuntimeException("Aquest mètode s'ha de completar...");
        }

        @Override
        public E next() {
            throw new RuntimeException("Aquest mètode s'ha de completar...");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
