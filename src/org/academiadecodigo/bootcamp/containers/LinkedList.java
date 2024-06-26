package org.academiadecodigo.bootcamp.containers;

import java.util.Iterator;

public class LinkedList<T>{

    private Node<T> head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }








    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(T data) {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public T get(int index) {

        Node<T> iterator = head.getNext();

        int i = 0;

        if (index < 0 || index >= length) {

            return null;
        }

        while (i < index) {

            iterator = iterator.getNext();
            i++;
        }

        return iterator.getData();


    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        Node iterator = head;

        for (int i = 0; i < length; i++) {

            iterator = iterator.getNext();

            if (data == iterator.getData()) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        Node iterator = head.getNext();
        Node previous = head;

        for (int i = 0; i < length; i++) {

            if (data.equals(iterator.getData())) {

                previous.setNext(iterator.getNext());

                length--;
                return true;
            }

            previous = previous.getNext();
            iterator = iterator.getNext();
        }

        return false;
    }

    public Node<T> getHead(){
        return this.head;
    }

    private class Node<T> {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
