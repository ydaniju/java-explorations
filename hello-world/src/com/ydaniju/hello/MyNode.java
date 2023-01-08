package com.ydaniju.hello;

import java.util.Objects;
import java.util.Optional;

public class MyNode<T> {
    T value;
    MyNode<T> next;
    MyNode<T> prev;

    public MyNode(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public MyNode(T value, MyNode<T> prev, MyNode<T> next) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyNode<?> myNode)) return false;
        return Objects.equals(value, myNode.value) && Objects.equals(next, myNode.next) && Objects.equals(prev, myNode.prev);
    }

    @Override
    public int hashCode() {
        T previousVal = Optional.ofNullable(prev).isPresent() ? prev.value : null;
        T nextVal = Optional.ofNullable(next).isPresent() ? next.value : null;

        return Objects.hash(value, previousVal, nextVal);
    }
}
