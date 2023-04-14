import java.io.*;
import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader input;
        BufferedReader frequencyTable;
        BufferedWriter output;
        String AlphabetFreq = "";
        String inputCleartext="";
        char alphabet;

        if (args.length != 3) {
            System.out.println("Usage: java Lab3 [frequencyTable file pathname] [input file pathname] [output file pathname]");
            System.exit(1);
            //check the input file path
        }
        try {
            frequencyTable=new BufferedReader(new FileReader(args[0]));
            input = new BufferedReader(new FileReader(args[1]));
            output = new BufferedWriter(new FileWriter(args[2]));

        } catch (Exception ioe) {
            System.err.println(ioe.toString());
            return;
        }



}
