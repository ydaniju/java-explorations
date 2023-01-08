package com.ydaniju.hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    @Test
    void hasAHead() {
        MyLinkedList<Integer> list = new MyLinkedList<>(1);

        assertInstanceOf(MyNode.class, list.head);
    }

    @Test
    void headCanHaveANullValue() {
        MyLinkedList<Integer> list = new MyLinkedList<>(null);

        assertNull(list.head.value);
    }

    @Test
    void mayNotHaveAHead() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        assertNull(list.head);
    }

    @Test
    void headMustNotHaveAPreviousValue() {
        MyLinkedList<Integer> list = new MyLinkedList<>(null);

        assertThrowsExactly(NullPointerException.class, (Executable) list.head.prev);
    }

    @Test
    void isEmptyIsTrue() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        assertTrue(list.empty());
        assertEquals(0, list.length);
    }

    @Test
    void isEmptyIsFalse() {
        MyLinkedList<Integer> list = new MyLinkedList<>(1);

        assertFalse(list.empty());
        assertEquals(1, list.length);
    }

    @Test
    void insertIntoEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);

        assertEquals(list.head.value, 2);
        assertEquals(1, list.length);
    }

    @Test
    void insertAtEnd() {
        MyLinkedList<String> list = new MyLinkedList<>("first");

        list.add("second");

        assertEquals(list.head.value, "first");
        assertEquals(list.head.next, new MyNode<>("second", list.head, null));
        assertEquals(2, list.length);
    }

    @Test
    void removeEmptyList() {
        MyLinkedList<String> list = new MyLinkedList<>();

        assertEquals(0, list.length);

        list.removeTail();

        assertEquals(0, list.length);
    }

    @Test
    void removeLastItem() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("1");
        list.add("hi");
        list.add("there");

        System.out.println(list);
        list.removeTail();
        System.out.println(list);

        assertEquals(2, list.length);
        assertEquals(list.tail().value, "hi");
    }
}