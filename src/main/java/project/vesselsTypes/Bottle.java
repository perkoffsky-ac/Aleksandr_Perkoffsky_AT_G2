package main.java.project.vesselsTypes;

import main.java.project.including.Bubble;
import main.java.project.materials.Material;
import main.java.project.materials.Plastic;
import main.java.project.substance.SparklingWater;
import main.java.project.substance.Transformable;

import java.io.Serializable;

public class Bottle extends Vessel implements Containable, Serializable {

    private SparklingWater water;
    private int temperature;

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        this.volume = volume;
        this.water = water;
    }
    public Bottle() {
        super(0.5, 2.5, 1, new Plastic());
    }

    public void pumpBubbles() {
        this.water.pump(this.getBubbles());
    }
    private Bubble[] getBubbles() {
        double count = volume * 10000; //кол-во пузырьков в зависимости от объема volume
        System.out.println(count);
        Bubble[] array = new Bubble[(int) count]; //тип дабл привели к типу инт
        for (int i = 0; i < array.length; i++) {
            array[i] = new Bubble("carbonDioxide");
        }
        return array;
    }
    public void warm(int temperature) {
        this.temperature = temperature;
    }
    public SparklingWater getWater() {
        return water;
    }
    public void setWater(SparklingWater water) {
        this.water = water;
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
        this.water.setOpened(true); //открыли бутылку
    }
    public void close() {

    }
}




