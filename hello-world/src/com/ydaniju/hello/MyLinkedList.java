package com.ydaniju.hello;

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
        }
        incrementLength();
    }

    void remove() {}

    Boolean empty() {
        return this.head == null;
    }

    private void incrementLength() {
        this.length += 1;
    }
}
