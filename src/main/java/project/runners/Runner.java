package project.runners;

import project.material.Material;
import project.vessel.Bottle;
import project.vessel.Containable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Runner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Containable bottle1 = new Bottle(0.5, 0.7, Material.GLASS);
        Containable bottle2 = new Bottle(1, 0.8, Material.METAL);
        Containable bottle3 = new Bottle(1.5, 0.9, Material.PLASTIC);
        bottle1.open();
        bottle2.open();
        bottle3.open();

        oos.writeObject(bottle3);
        oos.close();
        fos.close();

        System.out.print(bottle3.toString());
    }
}

