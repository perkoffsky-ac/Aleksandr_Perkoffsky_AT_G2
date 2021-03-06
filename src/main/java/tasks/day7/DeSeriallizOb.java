package main.java.tasks.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeSeriallizOb {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream oos = new ObjectInputStream(fis);
        ObjectInputStream ois = null;
        int i = ois.readInt();
        String today = (String) ois.readObject();
        Date date = (Date) ois.readObject();
        ois.close();
    }
}
