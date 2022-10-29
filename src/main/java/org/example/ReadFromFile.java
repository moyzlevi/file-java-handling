package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.example.Color.fOk;
import static org.example.Color.fWarning;

public class ReadFromFile implements FileAction{
    @Override
    public void execute(String filePath) {
        try(Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                System.out.println(colorize("Printing file data: ", fOk));
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(colorize("An error has occurred.", fWarning));
            e.printStackTrace();
        }
    }
}