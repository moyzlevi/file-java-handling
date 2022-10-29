package org.example;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static org.example.Color.fWarning;

public class FileCmdExec {

    private final Map<String, FileAction> fileActionMap;

    public FileCmdExec() {
        this.fileActionMap = new HashMap<>();
        this.fileActionMap.put("delete", new DeleteAFile());
        this.fileActionMap.put("create", new CreateFile());
        this.fileActionMap.put("read", new ReadFromFile());
        this.fileActionMap.put("write", new WriteToAFile());
    }

    public void execFileCmd(String command, String filePath) {
        if(fileActionMap.containsKey(command)) {
            fileActionMap.get(command).execute(filePath);
        } else {
            System.out.println(colorize("Invalid command", fWarning));
        }
    }
}
