package main.java.project.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox<?>> stock = new HashMap<>();

   /* public void addBox(VesselBox<?> box) {
        Stocktaking.registerBox(box);
        stock.put(box.hashCode(), box);
    }

    VesselBox<?> getBox(int id) {
        return stock.get(id);
    }

    void removeBox(int id) {
        Stocktaking.disposeBox(stock.get(id));
        stock.remove(id);
    }*/

    /*public static void main(String[] args) throws Exception {
        VesselBox<Vessel> box1 = new VesselBox<>(new Cup(), 9);
        VesselBox<Vessel> box2 = new VesselBox<>(new Bottle(), 36);

        Stocktaking.writeVessel(box1);
        Stocktaking.writeVessel(box2);
    }*/
}
