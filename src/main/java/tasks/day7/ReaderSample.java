package tasks.day7;

import java.io.*;
import java.util.Scanner;

public class ReaderSample {
    public static void main(String[] args) throws Exception {

       /* Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.println("Lust got '%s', incoming");*/

        read();
        /*write();*/
    }

    public static void read() throws Exception {

        BufferedReader in = new BufferedReader(new FileReader("C:/Users/perko/Desktop/AT_G2/Aleksandr_Perkoffsky_AT_G2/F1/F2/F3/F4/a.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    /*public static void write()  {

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.write("раму мыла мама");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}


