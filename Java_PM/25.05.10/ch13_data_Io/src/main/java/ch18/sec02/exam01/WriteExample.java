package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {

        try (OutputStream  os = new FileOutputStream("c:/temp/test1.db"))
        {
            byte a = 10;
            os.write(a);

            byte b = 20;
            os.write(b);

            byte c = 30;
            os.write(c);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
