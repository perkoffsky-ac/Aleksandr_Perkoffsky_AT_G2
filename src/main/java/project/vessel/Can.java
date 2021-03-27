package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.material.Metal;
import main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Can() {
        this(1.5, 10.0, new Metal());
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
