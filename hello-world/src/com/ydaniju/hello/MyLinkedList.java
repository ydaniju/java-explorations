package com.ydaniju.hello;

public class MyLinkedList<T> {
    public MyNode<T> head;

    MyLinkedList<T> add() {
        return this;
    }

    MyLinkedList<T> remove() {
        return this;
    }

    public MyLinkedList(T head) {
        this.head = new MyNode<T>(head, null, null);
    }
}
