package main.java.project.vesselsTypes;

import main.java.project.materials.Glass;
import main.java.project.materials.Material;
import main.java.project.substance.Transformable;

public class Cup extends Vessel implements Containable {

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }
    public Cup() {
        super(1.5, 1.5, 1, new Glass());
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


