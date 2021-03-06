package main.java.tasks.day7.HomeTask;

import java.io.*;
import java.util.Date;
import java.util.Random;

public class Chain {

    public static void main(String[] args) throws IOException {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);

        File file = new File("C:\\Users\\perko\\Desktop\\AT_G2\\Aleksandr_Perkoffsky_AT_G2\\F1");
        boolean isCreated1 = file.mkdir();
        File files = new File("C:\\Users\\perko\\Desktop\\AT_G2\\Aleksandr_Perkoffsky_AT_G2\\F1\\F2\\F3\\F4");
        boolean isCreated2 = files.mkdirs();
            FileOutputStream a = new FileOutputStream("C:/Users/perko/Desktop/AT_G2/Aleksandr_Perkoffsky_AT_G2/F1/F2/F3/F4/a.txt");
            ObjectOutputStream as = new ObjectOutputStream(a);
            as.writeInt(i);
            as.close();
            FileOutputStream b = new FileOutputStream("C:/Users/perko/Desktop/AT_G2/Aleksandr_Perkoffsky_AT_G2/F1/F2/F3/F4/b.txt");
            ObjectOutputStream bs = new ObjectOutputStream(b);
            bs.writeInt(i);
            bs.close();
        }
    }
}
