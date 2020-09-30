package lesson5.collection;


public interface myCollection<E> {

    int size();

    void add(E item);

    void remove(int index);

    void remove(E item);

    E get(int index);

    void clear();
}
