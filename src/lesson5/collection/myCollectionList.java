package lesson5.collection;

import java.util.NoSuchElementException;
import java.util.Objects;

public class myCollectionList<E> implements myCollection<E> {


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item) {
            this.item = item;
        }
    }

    int listSize;
    private Node<E> first;


    @Override
    public int size() {
        return listSize;
    }

    @Override
    public void add(E value) {
        if (first == null) {
            first = new Node<>(value);
        } else {
            Node<E> newNode = new Node<>(value);
            Node<E> saveNode = first;
            while (saveNode.next != null) {
                saveNode = saveNode.next;
            }
            saveNode.next = newNode;
            newNode.prev = saveNode;
        }
        listSize++;
    }

    @Override
    public void remove(int index) {
        Node<E> node = getNode(index);
        if (listSize == 1) {
            clear();
        } else if (node.next == null) {
            node.prev.next = null;
        } else if (node.prev == null) {
            node.next.prev = null;
            first = node.next;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        listSize--;
    }

    @Override
    public void remove(E item) {
        Node<E> node = first;
        while (!Objects.equals(node.item, item)) {
            node = node.next;
            if (node == null) {
                return;
            }
        }
        if (listSize == 1) {
            clear();
        } else if (node.next == null) {
            node.prev.next = null;
        } else if (node.prev == null) {
            node.next.prev = null;
            first = node.next;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        listSize--;
    }

    @Override
    public E get(int index) {
        return getNode(index).item;
    }

    private Node<E> getNode(int index) {
        if ((index < 0) || (index > size())) {

            throw new NoSuchElementException();
        } else {
            Node<E> searchElement = first;
            for (int i = 0; i < index; i++) {
                searchElement = searchElement.next;
            }
            return searchElement;
        }

    }


    @Override
    public void clear() {
        first = null;
        listSize = 0;
    }
}
