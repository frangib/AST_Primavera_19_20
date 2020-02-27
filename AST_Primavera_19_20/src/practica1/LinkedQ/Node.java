package practica1.LinkedQ;

public class Node<E> {

    private E value;
    private Node next;

    //We created this constructor.
    public Node(E value) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
