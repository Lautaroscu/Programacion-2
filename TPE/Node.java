package TPE;


public class Node<T> {
    private T element;
    private Node<T> nextElement;

    public Node(T elemento) {
        setElement(elemento);
        this.nextElement = null;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getValue() {
        return (this.element);
    }

    public void setNext(Node<T> nexElement) {
        this.nextElement = nexElement;

    }

    public Node<T> getNext() {
        return nextElement;
    }

}
