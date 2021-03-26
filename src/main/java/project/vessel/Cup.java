package main.java.project.vessel;

import main.java.project.material.Glass;
import main.java.project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    public Cup() {
        super(1.5, 8.0, 1, new Glass());
    }
    @Override
    public void addStuff(Transformable stuff) {

    }
    @Override
    public Transformable removeStuff() {
        return null;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public int getFreeSpace() {
        return 0;
    }
    @Override
    public void open() {

    }
    @Override
    public void close() {

    }
}


