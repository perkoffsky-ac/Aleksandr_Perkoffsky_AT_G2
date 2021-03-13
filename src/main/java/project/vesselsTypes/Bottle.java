package main.java.project.vesselsTypes;

import main.java.project.including.Bubble;
import main.java.project.materials.Material;
import main.java.project.materials.Plastic;
import main.java.project.substance.SparklingWater;
import main.java.project.substance.Transformable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable, Serializable {

    private List<Transformable> stuff = new ArrayList<>();
    private int temperature;
    SparklingWater water = new SparklingWater("no", "transparent", "no", 40);

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        this.volume = volume;
        pumpBubbles();

    }

    public Bottle() {
        super(0.5, 2.5, 1, new Plastic());
    }

    public void pumpBubbles() {
        this.water.pump(this.getBubbles());
    }

    private List<Bubble> getBubbles() {
        double count = volume * 10000;
        System.out.println(count);
        List<Bubble> bubbleList = new ArrayList<>((int) count);
        int bound = bubbleList.size();
        for (int i = 0; i < bound; i++) {
            bubbleList.set(i, new Bubble("carbonDioxide"));
        }
        return bubbleList;
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
        this.stuff.add(stuff);
    }

    public Transformable removeStuff() {
        return null;
    }

    public boolean isEmpty() {
        return stuff.isEmpty();
    }

    public int getFreeSpace() {
        return (int) getVolume() * 1000 - stuff.size();
    }

    public void open() {
        this.water.setOpened(true); //открыли бутылку
    }

    public void close() {
        this.water.setOpened(false);
    }
}




