package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.material.Plastic;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        super(0.5, 2.0, 1, new Plastic());
    }
    public void pumpBubbles() {
        this.water.pump(this.getBubbles());
    }
    private List<Bubble> getBubbles() {
        double count = volume * 10000;
        System.out.println(count);
        List<Bubble> bubbleList = new ArrayList<>((int) count);
        int bound = bubbleList.size();

        /*for (int i = 0; i < bound; i++) {
            bubbleList.set(i, new Bubble("carbonDioxide"));
        }*/

        bubbleList = IntStream.rangeClosed(0, (int) (count))
                .boxed()
                .map(i -> new Bubble("carbonDioxide"))
                .collect(Collectors.toList());
        return bubbleList;
    }
    public void warm(int temperature) {
        stuff = stuff.stream().
                peek(t -> t.setTemperature(temperature))
                .collect(Collectors.toList());
    }
    public SparklingWater getWater() {
        return water;
    }
    public void setWater(SparklingWater water) {
        this.water = water;
    }
    @Override
    public void addStuff(Transformable stuff) {
        this.stuff.add(stuff);
    }
    @Override
    public Transformable removeStuff() {
        return null;
    }
    @Override
    public boolean isEmpty() {
        return stuff.isEmpty();
    }
    @Override
    public int getFreeSpace() {
        return (int) getVolume() * 1000 - stuff.size();
    }
    @Override
    public void open() {
        stuff = stuff.stream()
                .peek(x -> x.setOpened(true))
                .collect(Collectors.toList()); //открыли бутылку
    }
    @Override
    public void close() {
        stuff = stuff.stream()
                .peek(x -> x.setOpened(false))
                .collect(Collectors.toList());
    }
}




