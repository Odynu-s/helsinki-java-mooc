package exercise34;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();

        for (String line : f.read("src/exercise34/file.txt")) {
            System.out.println(line);
        }
    }
}