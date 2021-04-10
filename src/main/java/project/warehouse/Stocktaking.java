/*package main.java.project.warehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Stocktaking {

    private Stocktaking() {
    }*/
/*

    public static void registerBox(VesselBox<?> box) {
        try (FileWriter fileWriter = new FileWriter(FILE.toFile())) {
            fileWriter.write(box.hashCode() + box.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void disposeBox(VesselBox<?> box) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(FILE.toFile()));
            List<String> temp = new ArrayList<>();
            while (fileReader.ready()) {
                String line1 = fileReader.readLine();
                String line2 = "#" + box.hashCode() + "#" + box.getName();
                if (!line1.equals(line2)) {
                    temp.add(line1);

                }

                private static final Path FILE = Path.of("file.txt");
                public static void getInfo () {
                    try {
                        BufferedReader fileReader = new BufferedReader(new FileReader(FILE.toFile()));
                        while (fileReader.ready()) {
                            String line = fileReader.readLine();
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

    */
/*public static void writeVessel(VesselBox<Vessel> vessel) throws Exception {
        FileOutputStream fos = new FileOutputStream("VesselBox.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(vessel);
        oos.close();
        fos.close();

        System.out.print(vessel.toString());
    }*//*


            public static void writeVessel () {
            }

            public static void writeVessel () {
            }*/
