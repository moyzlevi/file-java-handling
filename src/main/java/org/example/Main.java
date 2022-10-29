package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            String command = args[0];
            String filePath = args[1];


            FileCmdExec fileCmdExec = new FileCmdExec();
            fileCmdExec.execFileCmd(command, filePath);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no arguments sufficient!");
        }
    }
}
