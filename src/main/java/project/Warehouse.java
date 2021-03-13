package main.java.project;

import main.java.project.vesselsTypes.Bottle;
import main.java.project.vesselsTypes.Cup;
import main.java.project.vesselsTypes.Vessel;
import main.java.project.vesselsTypes.VesselBox;

public class Warehouse {

    public static void main(String[] args) throws Exception {
        VesselBox<? extends Vessel> box1 = new VesselBox<>(new Cup(), 9);
        VesselBox<? extends Vessel> box2 = new VesselBox<>(new Bottle(), 36);

        Stocktaking.writeVessel((VesselBox<Vessel>) box1);
        Stocktaking.writeVessel((VesselBox<Vessel>) box2);
    }
}
