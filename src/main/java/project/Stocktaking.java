package main.java.project;

import main.java.project.vesselsTypes.Vessel;
import main.java.project.vesselsTypes.VesselBox;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Stocktaking {
    public static void main(String[] args) {

    }
    public static void writeVessel(VesselBox<Vessel> vessel) throws Exception {
        FileOutputStream fos = new FileOutputStream("VesselBox.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(vessel);
        oos.writeObject(vessel);
        oos.close();
        fos.close();

        System.out.print(vessel.toString());
        System.out.print(vessel.toString());
    }
}
