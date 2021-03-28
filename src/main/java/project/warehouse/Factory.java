package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.Water;
import main.java.project.vessel.Bottle;

public class Factory {

    private Warehouse warehouse = new Warehouse();

    public static void main(String[] args) {
        Factory factory = new Factory();
        Water water = new SparklingWater(1.5);
        factory.createVesselBox(36, 3.0, Material.GLASS, water, Bottle.class);
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz) {
        if (capacity != 9 && capacity != 25 && capacity != 36) {
            System.out.println("Invalid amount");
        }

    }
}
