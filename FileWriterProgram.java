import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {
    public static void main(String[] args){
    
        File textFile = new File("main.txt");

        try {
            FileWriter writer = new FileWriter(textFile);
            writer.write("JQ Pogiiii!!!!");
            writer.close();
            System.out.println("printed successfully");

        }  catch (Exception e) {
            System.out.println("Nag error siya");
            e.printStackTrace();
        }
    }

}