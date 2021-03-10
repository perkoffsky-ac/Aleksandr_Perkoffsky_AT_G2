package main.java.project.vesselsTypes;

import main.java.project.materials.Material;
import main.java.project.materials.Metal;
import main.java.project.substance.Transformable;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }
    public Can() {
        super(1.5, 1.5, 1, new Metal());
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
