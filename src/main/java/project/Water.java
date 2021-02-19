package main.java.project;

public abstract class Water {

    private String color;
    private double transparency;
    private String smell;
    private int temperature;

    protected Water(String color, double transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

}

