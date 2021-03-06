package project.warehouse;

import project.vessel.Containable;
import project.vessel.Vessel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VesselBox<T extends Vessel> implements Serializable {

    private int capacity;
    private String name;
    private List<Containable> box;
    private long id;

    public VesselBox(String name, List<Containable> box) {
        this.name = "I am box with" + " <" + capacity + "> " + "<" + name + ">";
        this.box = box;
        id = new Random().nextLong();
        capacity = box.size();
    }

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

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }

    private void printContentsBox(List<T> vessels) {

        for (T vessel : vessels) {
            System.out.print(vessel.getClass().getSimpleName() + " ");
        }
        System.out.println();
    }
}
