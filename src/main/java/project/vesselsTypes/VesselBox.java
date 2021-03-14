package main.java.project.vesselsTypes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VesselBox<T extends Vessel> implements Serializable {

    public VesselBox(T vessel, int boxQuantity) throws Exception {

        if (boxQuantity != 9 && boxQuantity != 25 && boxQuantity != 36) {
            throw new Exception("This amount is not allowed");
        }
        ArrayList<Vessel> boxes = new ArrayList<>(boxQuantity);
        for (int i = 0; i < boxQuantity; i++) {
            boxes.add(vessel);
        }
        printContentsBox((List<T>) boxes);
    }
    private void printContentsBox(List<T> vessels) {

        for (T vessel : vessels) {
            System.out.print(vessel.getClass().getSimpleName() + " ");
        }
        System.out.println();
    }
}
