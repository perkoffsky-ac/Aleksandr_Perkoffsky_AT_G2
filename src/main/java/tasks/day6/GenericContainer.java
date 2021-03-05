package main.java.tasks.day6;

public class GenericContainer<T> {

    private T[] array;
    private int counter;

    public GenericContainer() {
        array = (T[]) new Object[10];
        int counter = 0;
    }

    public void add(T o) {
        array[counter++] = o;
    }

    public T removeLast() {
        T object = array[counter - 1];
        array[--counter] = null;
        return object;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}

