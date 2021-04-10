package tasks.day6;

public class Color {

    private String color;
    private int hex;

    public Color(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHex() {
        return hex;
    }

    public void setHex(int hex) {
        this.hex = hex;
    }
}
