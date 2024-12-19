package org.example.designpattern.exerciceIterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class StringWrapper implements Iterable<Character> {

    private final String element;
    private final boolean reverse;

    public StringWrapper(String element, boolean reverse) {
        this.element = element;
        this.reverse = reverse;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyIterator(element, reverse);
    }

    @Override
    public void forEach(Consumer<? super Character> action) {
        Iterable.super.forEach(action);
    }
}
