package main.java.project;

public class Bubble {

    private static double volume = 0.3;
    private String gas;

    public Bubble(String gas) {             //передаем в конструктор строку с названием газа пузырька
        this.gas = gas;                     //ссылка на теккущий объект
    }

    public void getVolume(double volume) {  //метод, возвращающий обьем пузырька
        this.getVolume(Bubble.volume);
    }

    public void burst() {
        System.out.print("Cramp!");

    }

}














