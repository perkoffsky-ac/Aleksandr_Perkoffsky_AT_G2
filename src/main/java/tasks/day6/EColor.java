package main.java.tasks.day6;

public enum EColor {

    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3),
    YELLOW("yellow", 4),
    PURPLE("purple", 5);

    String color;
    int hex;

    EColor(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }
}
