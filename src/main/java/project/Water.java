package main.java.project;

public abstract class Water {

    private String color;
    private double transparency;
    private String smell;
    private int temperature;

    protected Water(int temperature) {
        this.temperature = temperature;
    }

    public Water() {

    }
}

