// package TPE;

// import java.util.Comparator;
// import java.util.Iterator;

// public class List<T> {
// private Node<T> raiz;
// private Node<T> lastNode;
// private Comparator<T> orden;

// private Integer size;

// public List(Comparador<T> orden) {
// this.raiz = null;

// this.size = 0;
// this.orden = orden;

// }

// public void setLastNode(Node<T> nextNode) {
// this.lastNode = nextNode;
// }

// public void setRaiz(Node<T> raiz) {
// this.raiz = raiz;
// }

// public void add(T element) {
// if (raiz == null) {
// setRaiz(new Node<T>(element));
// setLastNode(new Node<T>(element));
// } else {
// Iterator<T> iterator = (Iterator<T>) this.getIterator();
// while (iterator.hasNext()) {
// try {

// Node<T> valor = (Node<T>) iterator.next();

// Node<T> actual = new Node<T>(element);
// valor.setNext(actual);
// }

// } catch (Exception e) {
// // TODO: handle exception
// }

// }

// }

// public Integer getSize() {
// return size;
// }

// public Node<T> getRaiz() {
// return raiz;
// }

// public Node<T> getLastNode() {
// return lastNode;
// }

// public Iterator<Node<T>> getIterator() {
// return new NodeIterator<T>(raiz);
// }

// public T get(int i) {

// if (existeIndice(i)) {
// int contador = 0;
// for (Node<T> nodoi = raiz; nodoi != null; nodoi = nodoi.getNext()) {
// if (contador == i) {
// return nodoi.getValue();
// }
// contador++;
// }
// }
// return null;

// }

// private boolean existeIndice(int index) {
// return index >= 0 && index <= size - 1;
// }
// }
