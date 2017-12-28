package org.test.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by lichao on 2017/12/28.
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
