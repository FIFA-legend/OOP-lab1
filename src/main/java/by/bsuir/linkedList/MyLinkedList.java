package by.bsuir.linkedList;

import by.bsuir.entities.Figure;

import java.util.Comparator;

public class MyLinkedList<T extends Figure> {

    private int length;

    private Link<T> first;

    private Link<T> last;

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private void insertFirst(T item) {
        Link<T> newLink = new Link<>(item);
        if (isEmpty()) last = newLink;
        else first.previous = newLink;
        newLink.next = first;
        first = newLink;
        length += 1;
        Link<T> current = newLink.next;
        while (current != null) {
            current.place = current.place + 1;
            current = current.next;
        }
    }

    private void insertLast(T item) {
        Link<T> newLink = new Link<>(item);
        newLink.place = length;
        if (isEmpty()) first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
        length += 1;
    }

    private void deleteFirst() {
        if (first.next == null) last = null;
        else first.next.previous = null;
        first = first.next;
        length -= 1;
        Link<T> current = first;
        while (current != null) {
            current.place = current.place - 1;
            current = current.next;
        }
    }

    private void deleteLast() {
        if (first.next == null) first = null;
        else last.previous.next = null;
        last = last.previous;
        length -= 1;
    }

    public void insert(int key, T item) {
        if (key == 0) insertFirst(item);
        else if (key == length) insertLast(item);
        else {
            Link<T> current = first;
            while (current.place != key) {
                current = current.next;
            }
            Link<T> newLink = new Link<>(item);
            newLink.place = current.place;
            newLink.previous = current.previous;
            newLink.next = current;
            current.previous.next = newLink;
            current.previous = newLink;
            length += 1;
            while (current != null) {
                current.place = current.place + 1;
                current = current.next;
            }
        }
    }

    public void insert(T item) {
        insertLast(item);
    }

    public void delete(int key) {
        if (key == 0) deleteFirst();
        else if (key == length - 1) deleteLast();
        else {
            Link<T> current = first;
            while (current.place != key) {
                current = current.next;
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
            length -= 1;
            current = current.next;
            while (current != null) {
                current.place = current.place - 1;
                current = current.next;
            }
        }
    }

    public void update(int key, T item) {
        Link<T> current = first;
        while (current.place != key) {
            current = current.next;
        }
        current.item = item;
    }

    public T get(int key) {
        Link<T> current;
        if (key <= length / 2 - 1) {
            current = first;
            while (current.place != key) {
                current = current.next;
            }
        } else {
            current = last;
            while (current.place != key) {
                current = current.previous;
            }
        }
        return current.item;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = this.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(this.get(j + 1), this.get(j)) > 0) {
                    T temp = this.get(j);
                    this.update(j, this.get(j + 1));
                    this.update(j + 1, temp);
                }
            }
        }
    }

    public T first() {
        return first.item;
    }

    public T last() {
        return last.item;
    }

    @Override
    public String toString() {
        String str = "";
        Link<T> current = first;
        while (current != null && current.next != null) {
            str = str.concat(current.item + ", ");
            current = current.next;
        }
        if (current != null) {
            str = str.concat(current.item.toString());
        }
        return "{" + str + '}';
    }
}
