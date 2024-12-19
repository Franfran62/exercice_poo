package org.example.designpattern.exerciceIterator;

import java.util.Iterator;

public class MyIterator implements Iterator<Character> {

    private final String element;
    private final boolean reverse;
    private int cursor;


    public MyIterator(String element, boolean reverse) {
        this.element = element;
        this.reverse = reverse;
        cursor = reverse ? (element.length() - 1) : 0;
    }

    @Override
    public boolean hasNext() {
        return reverse ? cursor >= 0 : cursor < element.length();
    }

    @Override
    public Character next() {
        return reverse ? element.charAt(cursor--) : element.charAt(cursor++);
    }
}
