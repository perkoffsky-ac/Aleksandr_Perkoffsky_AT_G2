package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Stocktaking {

    public static void writeVessel(VesselBox<Vessel> vessel) throws Exception {
        FileOutputStream fos = new FileOutputStream("VesselBox.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(vessel);
        oos.close();
        fos.close();

        System.out.print(vessel.toString());
    }
}
