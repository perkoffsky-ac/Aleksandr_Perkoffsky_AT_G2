package main.java.project.Interfaces;

public interface Containable {

    Transformable[] array = new Transformable[5];
    int counter = 0;

    default void addStuff(Transformable stuff) {
        array[counter++] = stuff;
    }

    default Transformable removeStuff() {
        Transformable transformable = array[counter - 1];
        array[counter--] = null;
        return transformable;
    }

    default boolean isEmpty() {
        return counter == 0;
    }

    default int getFreeSpace(); {

    }

    default void open() {

    }

    default void close() {

    }
}

