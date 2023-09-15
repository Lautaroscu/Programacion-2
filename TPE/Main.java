package TPE;

public class Main {
    public static void main(String[] args) {
        Comparador<Integer> comparadorInteger = new ComparadorInt<Integer>();
        List<Integer> arrayEnteros = new List<Integer>(comparadorInteger);
        for (int i = 0; i < 5; i++) {

            arrayEnteros.add(i);

        }
        System.out.println(arrayEnteros.get(2));

    }
}
