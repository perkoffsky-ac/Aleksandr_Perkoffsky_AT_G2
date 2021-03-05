package main.java.tasks.day6;

public class ObjectContainer {

    Object[] array = new Object[10];
    int counter = 0;

    public void add(Object o) {
        array[counter++] = o;
    }

    public Object removeLast() {
        Object object = array[counter - 1];
        array[--counter] = null;
        return object;

    }

    public boolean isEmpty() {
        return counter == 0;

    }
}




