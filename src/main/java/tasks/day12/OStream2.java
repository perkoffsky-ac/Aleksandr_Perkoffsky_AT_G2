package tasks.day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OStream2 {

    public static void main(String[] args) {

        try (OutputStream stream = new FileOutputStream("file.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
