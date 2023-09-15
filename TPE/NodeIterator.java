package TPE;

import java.util.Iterator;

public class NodeIterator<T> implements Iterator<Node<T>> {
    private Node<T> actual;

    public NodeIterator(Node<T> n) {
        actual = n;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Node<T> next() {
        Node<T> aux = actual;
        actual = actual.getNext();
        return aux;

    }
}
