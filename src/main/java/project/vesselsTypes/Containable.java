package main.java.project.vesselsTypes;

import main.java.project.substance.Transformable;

public interface Containable {

    default void addStuff(Transformable stuff) {

    }
    default Transformable removeStuff() {
        return null;
    }
    default boolean isEmpty() {
        return true;
    }
    default int getFreeSpace() {
        return 0;
    }
    default void open() {

    }
    default void close() {

    }
}