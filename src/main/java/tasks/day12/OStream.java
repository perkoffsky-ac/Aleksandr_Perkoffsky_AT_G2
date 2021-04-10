package tasks.day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OStream {

    public static void main(String[] args) {

        OutputStream stream = null;
        try {
            stream = new FileOutputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



