package main.java.project;

public class Runner {
    public static void main(String[] args) {
        SparklingWater sparklingWater = new SparklingWater(2);
        Bottle bottle1 = new Bottle(0.5, sparklingWater);
        Bottle bottle2 = new Bottle(1, sparklingWater);
        Bottle bottle3 = new Bottle(1.5, sparklingWater);
        bottle1.open();
        bottle2.open();
        bottle3.open();
    }

}