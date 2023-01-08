package com.ydaniju.hello;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<T> {
    public MyNode<T> head;
    public Integer length = 0;

    public MyLinkedList(T head) {
        this.head = new MyNode<>(head, null, null);
        incrementLength();
    }

    public MyLinkedList() {
        this.head = null;
    }

    void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);

        if (this.empty()) {
            this.head = newNode;
        } else {
            MyNode<T> currentNode = this.head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        incrementLength();
    }

    MyNode<T> tail() {
        MyNode<T> currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    void removeTail() {
        if (this.empty()) return;

        MyNode<T> currentNode = this.head;

        while (currentNode.next != null && currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;

        decrementLength();
    }

    Boolean empty() {
        return this.head == null;
    }

    private void incrementLength() {
        this.length += 1;
    }

    private void decrementLength() {
        this.length -= 1;
    }

    private List<T> traverse() {
        List<T> values = new ArrayList<>();
        MyNode<T> currentNode = this.head;

        while (currentNode != null) {
            values.add(currentNode.value);

            currentNode = currentNode.next;
        }

        return values;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", length=" + length +
                ", values=" + this.traverse() +
                '}';
    }
}
