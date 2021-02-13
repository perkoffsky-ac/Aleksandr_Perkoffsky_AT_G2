public class Runner {
    public static void main(String[] args) {
        SparklingWater sparklingWater = new SparklingWater("red", 0.5, "bread", 52);
        Bottle bottle1 = new Bottle(0.5, sparklingWater);
        Bottle bottle2 = new Bottle(1, sparklingWater);
        Bottle bottle3 = new Bottle(1.5, sparklingWater);
        bottle1.open();
        bottle2.open();
        bottle3.open();
    }

}