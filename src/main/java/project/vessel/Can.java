package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }

    public Can() {
        this(1.5, 10.0, Material.METAL);
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
