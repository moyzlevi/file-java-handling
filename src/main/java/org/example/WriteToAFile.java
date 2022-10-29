package org.example;

import java.io.FileWriter;
import java.io.IOException;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.example.Color.fWarning;

public class WriteToAFile implements FileAction {
    @Override
    public void execute(String filePath) {
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write("Files in java are astronomical! \uD83E\uDE90");
        } catch (IOException e) {
            System.out.println(colorize("An error has occurred.", fWarning));
            e.printStackTrace();
        }
    }
}