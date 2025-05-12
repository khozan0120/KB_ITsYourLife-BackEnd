package ch18.sec02.exm02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args)  {

        try (OutputStream os = new FileOutputStream("c:/temp/test.db"))
        {
            byte[] array = {10, 20, 30};

            os.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
