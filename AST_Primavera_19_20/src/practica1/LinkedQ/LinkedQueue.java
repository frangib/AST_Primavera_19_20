package practica1.LinkedQ;

import java.util.Iterator;
import utils.Queue;

public class LinkedQueue<E> implements Queue<E> {

    //Completar...
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int numElem;

    public LinkedQueue() {
        numElem = 0;
    }

    @Override
    public int size() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return numElem;
    }

    @Override
    public int free() {
        throw new UnsupportedOperationException("Not applies");
    }

    @Override
    public boolean hasFree(int n) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        //Isn't this always true for a linked list?
        return true;
    }

    @Override
    public boolean empty() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return numElem == 0;
    }

    @Override
    public boolean full() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        //Isn't this always false for a linked list?
        //By now we'll say that it always returns false;
        return false;
    }

    @Override
    public E peekFirst() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");       
        return firstNode.getValue();
    }

    @Override
    public E peekLast() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        return lastNode.getValue();
    }

    @Override
    public E get() {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        Node<E> aux;
        aux = firstNode;
        numElem--;
        firstNode = firstNode.getNext();
        return aux.getValue();

    }

    @Override
    public void put(E value) {
        //throw new RuntimeException("Aquest mètode s'ha de completar...");
        /*
        Create node n to add.
        Set new node n as the next node after lastNode.
        Set n as lastNode.
        Increase numElem;
        */
        Node n = new Node(value);
        if(this.empty()){
            firstNode = n;
            lastNode = firstNode;
        }
        lastNode.setNext(n);
        lastNode = n;
        numElem++;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator {

        //Completar
        Node<E> index = firstNode;
        int count = 0;
        @Override
        public boolean hasNext() {
            //throw new RuntimeException("Aquest mètode s'ha de completar...");
            return (count < numElem);
        }

        @Override
        public E next() {
            //throw new RuntimeException("Aquest mètode s'ha de completar...");
            E aux = index.getValue();
            index = index.getNext();
            count++;
            return aux;
        }

        /* Alfonso told us not to implement it for CircularQueue so by now we 
        won't implement it here either.
        */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
