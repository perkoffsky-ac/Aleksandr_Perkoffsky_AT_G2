/*package project.warehouse;

import project.material.Material;
import project.stuff.SparklingWater;
import project.stuff.Transformable;
import project.stuff.Water;
import project.vessel.Bottle;

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
}*/
