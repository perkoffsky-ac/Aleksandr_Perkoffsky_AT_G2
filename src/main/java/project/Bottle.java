package main.java.project;

public class Bottle {

    private double volume;
    private SparklingWater water;
    private int temperature;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
        this.water.pump(this.getBubbbles());

    }


    public void open() {
        this.water.open(); //открыли бутылку
    }

    private Bubble[] getBubbbles() {
        double count = this.volume * 10000; //кол-во пузырьков в зависимости от объема volume
        System.out.println(count);
        Bubble[] array = new Bubble[(int)count]; //тип дабл привели к типу инт
        for (int i = 0; i < array.length; i++) {
            array[i] = new Bubble("carbonDioxide");
        }
        return array;
    }

    public void warm (int temperature) {
        this.temperature = temperature;
        SparklingWater sparklingWater = new SparklingWater(this.temperature()); //установка температуры
    }

    private int temperature() {
        return 40;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }

    public SparklingWater getWater() {
        this.water = water;
        return water;
    }


}
