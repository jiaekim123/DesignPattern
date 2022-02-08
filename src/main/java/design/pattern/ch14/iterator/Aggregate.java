package design.pattern.ch14.iterator;

import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
