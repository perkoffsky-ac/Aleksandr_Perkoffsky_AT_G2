package main.java.project;

public class Runner {
    public static void main(String[] args) {
        SparklingWater water = new SparklingWater("no", "transparent", "no", 40);
        Bottle bottle1 = new Bottle(0.5, water);
        Bottle bottle2 = new Bottle(1, water);
        Bottle bottle3 = new Bottle(1.5, water);
        bottle1.open();
        bottle2.open();
        bottle3.open();
    }

}