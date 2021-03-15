package by.bsuir.linkedList;

class Link<T> {

    int place;

    T item;

    Link<T> next;

    Link<T> previous;

    public Link(T item) {
        this.item = item;
    }

}
