package main.java.project.stuff;

import java.io.Serializable;

public class Bubble implements Serializable {

    private static final double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void getVolume(double volume) {
        this.getVolume(Bubble.volume);
    }

    public void cramp() {
        System.out.print("Cramp!");
    }
}














