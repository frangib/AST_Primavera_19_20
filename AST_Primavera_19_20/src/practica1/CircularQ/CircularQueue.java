package practica1.CircularQ;

import java.util.Iterator;
import utils.Queue;

public class CircularQueue<E> implements Queue<E> {

    private final E[] queue;
    private final int N;
    private int head, tail, numElem;

    public CircularQueue(int N) {
        this.N = N;
        queue = (E[]) (new Object[N]);
    }

    @Override
    public int size() {
        return numElem;
    }

    @Override
    public int free() {
        return N - numElem;
    }

    @Override
    public boolean hasFree(int n) {
        if (n < 0) {
            throw new RuntimeException("Cannot have negative number of positions.");
        }
        return (N - numElem) >= n;
    }

    @Override
    public boolean empty() {
        return this.hasFree(N);
    }

    @Override
    public boolean full() {
        //return this.hasFree(0);-->No funciona.
        return numElem == N;
    }

    @Override
    public E peekFirst() {
        if (this.empty()) {
            return null;
        } else {
            return this.queue[head];
        }
    }

    @Override
    public E peekLast() {
        if (this.empty()) {
            return null;
        } else {
            return this.queue[tail];
        }
    }

    @Override
    public E get() {
        E aux;
        if (this.empty()) {
            throw new RuntimeException("Cannot 'get', the queue is empty");
        } else {
            aux = this.peekFirst();
            this.queue[head] = null;
            head = (head + 1) % N;
            numElem--;
            return aux;
        }
    }

    @Override
    public void put(E e) {
        if (this.full()) {
            throw new RuntimeException("Cannot 'put', the queue is full");
        }
        else {
            
            queue[tail]=e;
            tail = (tail+1) % N;
            numElem++;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }
    //Note: iterator cannot alter the state of the queue because it's purpose
    //it's just to iterate.
    class MyIterator implements Iterator {

        //Completar...
        private int index = head;
        private int count = 0;
        
        @Override
        public boolean hasNext() {
            //return !(index == tail);->index may not have been "returned"(?)
            //yet so this wouldn't be wrong but would be imprecise.
            return (count < numElem);
        }
        @Override
        public E next() {
            //throw new RuntimeException("Aquest mètode s'ha de completar...");
            E aux = queue[index];
            index = (index + 1)%N;
            count++;
            return aux;
        }

        //Don't implement.
        @Override
        public void remove() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }

    }
}
