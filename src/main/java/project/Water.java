package main.java.project;

public abstract class Water {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    protected Water(int temperature) {
        this.temperature = temperature;

    }

    public Water() {

    }
}

