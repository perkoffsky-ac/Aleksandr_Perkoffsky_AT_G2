package main.java.project;

public class Bottle {

    private static double volume;
    private SparklingWater water;
    private int temperature;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
        this.water.pump(this.getBubbles());
    }

    public void open() {
        this.water.setOpened(true); //открыли бутылку

    }

    private Bubble[] getBubbles() {
        double count = volume * 10000; //кол-во пузырьков в зависимости от объема volume
        System.out.println(count);
        Bubble[] array = new Bubble[(int) count]; //тип дабл привели к типу инт
        for (int i = 0; i < array.length; i++) {
            array[i] = new Bubble("carbonDioxide");
        }
        return array;
    }

    public void warm(int temperature) {
        this.temperature = temperature;

    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;

    }

}




