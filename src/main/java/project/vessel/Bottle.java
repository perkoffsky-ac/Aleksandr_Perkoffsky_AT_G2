package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bottle extends Vessel implements Containable, Serializable {

    private List<Transformable> stuff = new ArrayList<>();

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        this.volume = volume;
    }

    public Bottle() {
        this(0.5, 2.0, Material.PLASTIC);
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
        return 0;
    }

    @Override
    public void open() {
        stuff = stuff.stream()
                .peek(x -> x.setOpened(true))
                .collect(Collectors.toList());
    }

    @Override
    public void close() {
        stuff = stuff.stream()
                .peek(x -> x.setOpened(false))
                .collect(Collectors.toList());
    }

    public void warm(int temperature) {
        stuff = stuff.stream()
                .peek(t -> t.setTemperature(temperature))
                .collect(Collectors.toList());
    }
}




