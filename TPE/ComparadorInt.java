package TPE;

public class ComparadorInt<T> extends Comparador<Integer> {
    public ComparadorInt() {
    }

    @Override
    public int compare(Integer element1, Integer element2) {
        try {
            if (element1 < element2)
                return -1;

            else if (element1 > element2)
                return 1;

            return 0;

        } catch (Exception e) {
            System.err.println(e);

        }
        return 0;
    }

}
