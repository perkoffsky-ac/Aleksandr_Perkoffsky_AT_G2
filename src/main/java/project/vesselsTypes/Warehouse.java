package main.java.project.vesselsTypes;

import main.java.project.Stocktaking;

public class Warehouse {

    public static void main(String[] args) throws Exception {
        VesselBox<? extends Vessel> box1 = new VesselBox<>(new Cup(), 9);
        VesselBox<? extends Vessel> box2 = new VesselBox<>(new Bottle(), 36);

        Stocktaking.writeVessel((VesselBox<Vessel>) box1);
        Stocktaking.writeVessel((VesselBox<Vessel>) box2);
    }
}
