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
