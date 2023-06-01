package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static ArrayList<String> fileToString(String fileName) {
        try {
            Scanner fileReader = new Scanner(new File("assets/docs/" + fileName + ".csv"));
            ArrayList<String> lines = new ArrayList<String>();
            while (fileReader.hasNext())
                lines.add(fileReader.nextLine());
            fileReader.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
    }
}
