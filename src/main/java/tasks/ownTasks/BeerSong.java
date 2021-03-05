package main.java.tasks.ownTasks;

public class BeerSong {

    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.print(beerNum + " " + word + " пива. ");
            System.out.print("Возьми одну.");
            System.out.println(" Пусти по кругу.");

            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "бутылка";

            }
        }

        System.out.println("Нет бутылок пива на стене");
    }
}
