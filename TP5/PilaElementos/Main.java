package TP5.PilaElementos;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> p = new Pila();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);

        p.mostrarElementos();
        Integer[] copyRev = p.reverse();

        for (int i = 0; i < p.getSize(); i++) {
            System.out.println(copyRev[i]);
        }

    }
}
