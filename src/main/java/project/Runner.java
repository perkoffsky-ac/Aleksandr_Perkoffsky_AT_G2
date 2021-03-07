package main.java.project;

import main.java.project.Interfaces.Containable;
import main.java.project.Materials.Glass;
import main.java.project.Materials.Metal;
import main.java.project.Materials.Plastic;
import main.java.project.Substance.Sand;
import main.java.project.Vessels.Bottle;
import main.java.project.Substance.SparklingWater;
import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);*/

        SparklingWater water = new SparklingWater("no", "transparent", "no", 40);
        Sand sand = new Sand();

        Glass glass = new Glass(1.1, "red", 1.2);
        Plastic plastic = new Plastic(2.1, "black", 2.2);
        Metal metal = new Metal(3.1, "blue", 3.2);

        Containable bottle1 = new Bottle(0.5, 0.7, 2, glass);
        Containable bottle2 = new Bottle(1, 0.8, 3, plastic);
        Containable bottle3 = new Bottle(1.5, 0.9, 4, metal);
        bottle1.open();
        bottle2.open();
        bottle3.open();

/*
        for (int i = 0; i < 10; i++) {
            container.addStuff(i);
            container.addStuff(water);
        }
        while (!container.isEmpty()) {
            Transformable transformable = container.removeStuff();
        }
    }*/
/*
        oos.writeObject(bottle3);
        oos.close();
        fos.close();

        System.out.print(bottle3.toString());*/
    }
}

