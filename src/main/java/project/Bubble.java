package main.java.project;

public class Bubble {

    private static double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public Bubble() {

    }

    public void getVolume(double volume){
        this.getVolume(Bubble.volume);
    }

    public boolean burst() {

        System.out.print("Cramp!");

        return false;
    }

}














