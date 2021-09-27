package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PolicyReader {
    private String filePath = null;

    public PolicyReader(String filePath) {
        System.out.println("Filepath: \"" + filePath + "\"");
        this.filePath = filePath;
    }

    public String readFile(){
        String data = "";

        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String row = myReader.nextLine();
                data += row + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return data;
    }

}
