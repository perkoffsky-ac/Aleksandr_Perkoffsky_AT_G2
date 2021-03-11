package main.java.tasks.day7;

import java.io.*;
import java.util.Date;


public class SerializOb {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("t.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Date());
        oos.close();


    }
}

