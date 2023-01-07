package com.ydaniju.hello;

import java.util.Objects;

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
        return Objects.hash(value, next, prev);
    }
}
