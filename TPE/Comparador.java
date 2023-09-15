package TPE;

import java.util.Comparator;

public abstract class Comparador<T> implements Comparator<T> {

    @Override
    public abstract int compare(T Obj1, T Obj2);

}
