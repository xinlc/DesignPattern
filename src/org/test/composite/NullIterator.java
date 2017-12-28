package org.test.composite;

import java.util.Iterator;

/**
 * Created by lichao on 2017/12/28.
 */
public class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
