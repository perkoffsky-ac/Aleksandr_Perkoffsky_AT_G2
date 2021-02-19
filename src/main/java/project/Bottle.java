package main.java.project;

public class Bottle {

    private double volume;
    private SparklingWater sparklingWater;

    public Bottle(double volume, SparklingWater sparklingWater) {
        this.volume = volume;
        this.sparklingWater = sparklingWater;
        this.sparklingWater.pump(this.getBubbbles());
    }

    public void open() {
        this.sparklingWater.open(); //открыли бутылку
    }

    private Bubble[] getBubbbles() {
        double count = this.volume * 10000; //кол-во пузырьков в зависимости от объема volume
        System.out.println(count);
        Bubble[] array = new Bubble[(int)count]; //тип дабл привели к типу инт
        for (int i = 0; i < array.length; i++) {
            array[i] = new Bubble(0.2);
        }
        return array;
    }

}
