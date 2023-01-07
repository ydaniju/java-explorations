package com.ydaniju.hello;

public class MyNode<T> {
    T value;
    MyNode<T> next;
    MyNode<T> prev;

    public MyNode(T value, MyNode<T> next, MyNode<T> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
