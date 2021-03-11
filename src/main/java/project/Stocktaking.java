package main.java.project;

import main.java.project.vesselsTypes.Bottle;
import main.java.project.vesselsTypes.Cup;
import main.java.project.vesselsTypes.Vessel;
import main.java.project.vesselsTypes.VesselBox;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Stocktaking extends Warehouse {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("VesselBox.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        VesselBox<? extends Vessel> box1 = new VesselBox<>(new Cup(), 9);
        VesselBox<? extends Vessel> box2 = new VesselBox<>(new Bottle(), 36);

        oos.writeObject(box1);
        oos.writeObject(box2);
        oos.close();
        fos.close();

        System.out.print(box1.toString());
        System.out.print(box2.toString());
    }
}
