package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.example.Color.fOk;
import static org.example.Color.fWarning;

public class DeleteAFile implements FileAction{
    @Override
    public void execute(String filePath) {
        File file = new File(filePath);
        if(file.delete()) {
            System.out.println(colorize("The file deleted is " + file.getName(), fOk));
        } else {
            System.out.println(colorize("Failed deleting the file!", fWarning));
        }
    }
}