package org.example;

import java.io.File;
import java.io.IOException;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.example.Color.fOk;
import static org.example.Color.fWarning;

public class CreateFile implements FileAction {
    @Override
    public void execute(String filePath) {
        try {
            File newFile = new File(filePath);
            if(newFile.createNewFile()) {
                System.out.println(colorize("File created: " + newFile.getName(), fOk));
            }
        } catch (IOException e) {
            System.out.println(colorize("An error has occurred.", fWarning));
            e.printStackTrace();
        }
    }
}