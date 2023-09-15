package TP5.PilaElementos;

public class Pila<T> {
    private T data[];
    private int size;
    private int espacioDisponible;

    public Pila() {
        size = 0;
        espacioDisponible = 200;

        data = (T[]) new Object[espacioDisponible];

    }

    public Pila(T[] toCopy) {
        makeCopy(toCopy);
    }

    private Object[] makeCopy(Object[] original) {
        Object[] copy = (T[]) new Object[original.length];
        for (int i = 0; i < getSize(); i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public T pop() {
        T aux = data[size - 1];
        data[size - 1] = null;
        size--;

        return aux;

    }

    public void push(T value) {
        if (!hayEspacio()) {
            hacerEspacio();
        }

        data[size] = value;

        size++;

    }

    public int espacioTotal() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public void mostrarElementos() {
        for (int i = 0; i < getSize(); ++i) {
            System.out.println("El elemento en la posicion " + i + " de la pila es: " + data[i]);
        }
    }

    public void push(T value, int index) {

        if (!hayEspacio()) {
            hacerEspacio();
        }
        if (existeIndex(index)) {
            T aux = data[size - 1];
            corrimientoDer(data, index);
            data[index] = value;
            data[size] = aux;

        } else {
            throw new IndexOutOfBoundsException("No existe el indice");
        }
        size++;

    }

    public boolean existeIndex(int index) {
        return index >= 0 && index <= size - 1;
    }

    public void hacerEspacio() {
        T[] aux = (T[]) new Object[data.length * 2];
        for (int i = 0; i < getSize(); i++) {
            aux[i] = data[i];
        }
        data = aux;
    }

    public boolean hayEspacio() {
        return size < data.length;
    }

    public void corrimientoDer(T[] data, int inxdex) {
        for (int i = size - 1; i > inxdex; i--) {
            data[i] = data[i - 1];
        }
    }

    public T get(int index) {
        if (!existeIndex(index)) {
            throw new IndexOutOfBoundsException("Indice fuera del rango");
        }
        return this.data[index];
    }

    public int findIndex(T value) {
        for (int i = 0; i < getSize() - 1; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public int findIndex(int start, T value) {
        for (; start < getSize() - 1; ++start) {
            if (data[start].equals(value)) {
                return start;
            }
        }
        return -1;
    }

    public T[] reverse() {
        int j = getSize() - 1;
        Object[] copy = makeCopy(data);
        for (int i = 0; i < (getSize() / 2); i++) {
            T aux = (T) copy[i];
            copy[i] = copy[j];
            copy[j] = aux;
            j--;
        }

        return (T[]) copy;
    }
}