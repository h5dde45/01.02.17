package va.t8.p2;

import java.util.HashSet;
import java.util.Iterator;

public class MultiSetImpl<E> extends HashSet<E> implements MultiSet<E>{

    private Object[] store;

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
}
