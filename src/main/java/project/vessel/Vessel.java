package main.java.project.vessel;

import main.java.project.material.Material;

public abstract class Vessel {

    public double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = (int) (material.getDensity()*volume/4);
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
