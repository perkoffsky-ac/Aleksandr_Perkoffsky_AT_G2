package main.java.project.material;

public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Glass() {
        super(2.0, "red", 2);
    }
}
