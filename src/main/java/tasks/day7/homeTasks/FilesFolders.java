package tasks.day7.homeTasks;

import java.io.File;
import java.io.IOException;

public class FilesFolders {

    public static void main(String[] args) throws IOException {
        File folder = new File("C:/Users/perko/Desktop/AT_G2/Aleksandr_Perkoffsky_AT_G2");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
