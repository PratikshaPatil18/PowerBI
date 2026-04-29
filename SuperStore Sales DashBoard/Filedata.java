//write java string item1 in file data.txt using ofstrem read using ifstrem and display


import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileData {
    public static void main(String[] args) {
        try {
            // Writing "item1" to file
            FileOutputStream f = new FileOutputStream("data.txt");
            String data = "item1";
            f.write(data.getBytes());
            fos.close();

            // Reading from file
            FileInputStream fin = new FileInputStream("data.txt");
            int i;
            System.out.print("File content: ");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}