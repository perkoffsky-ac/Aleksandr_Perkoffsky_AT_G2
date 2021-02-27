package main.java.project;

public abstract class Water {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    int temperature = 0;

    public Water(String color, String transparency, String smell, int temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

}

