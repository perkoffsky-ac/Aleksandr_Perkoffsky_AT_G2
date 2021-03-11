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
    public void addStuff(Transformable stuff) {

    }
    public Transformable removeStuff() {
        return null;
    }
    public boolean isEmpty() {
        return false;
    }
    public int getFreeSpace() {
        return 0;
    }
    public void open() {

    }
    public void close() {

    }
}


