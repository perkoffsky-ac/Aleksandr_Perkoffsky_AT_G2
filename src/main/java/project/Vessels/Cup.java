package main.java.project.Vessels;

import main.java.project.Interfaces.Containable;
import main.java.project.Including.Bubble;
import main.java.project.Materials.Material;
import main.java.project.Substance.SparklingWater;

public class Cup extends Vessel implements Containable {

    private SparklingWater water;
    private int temperature;

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        this.volume = volume;
        this.water = water;
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
