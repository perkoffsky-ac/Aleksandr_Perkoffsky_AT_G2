package main.java.project.warehouse;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

public class Warehouse {

    public static void main(String[] args) throws Exception {
        VesselBox<Vessel> box1 = new VesselBox<>(new Cup(), 9);
        VesselBox<Vessel> box2 = new VesselBox<>(new Bottle(), 36);

        Stocktaking.writeVessel(box1);
        Stocktaking.writeVessel(box2);
    }
}
