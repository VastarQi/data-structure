import java.io.*;

public class checkcorrect {
    public static void main(String[] args) throws IOException {
        BufferedReader input;
        BufferedWriter complexity;
        BufferedWriter quickSorted;
        BufferedWriter hQuick50sorted;
        BufferedWriter hQuick100sorted;
        BufferedWriter mQuickSorted;
        BufferedWriter mergeSorted;
        String AlphabetFreq = "";
        String inputCleartext="";
        char alphabet;

        if (args.length != 6) {
            System.out.println("Usage: java Lab4 [input] [output-complexity statistic] [Quick sorted][50HybridQuick sorted][100HybridQuick sorted][merge sorted]");
            System.exit(1);
            //check the input file path
        }
        try {
            input=new BufferedReader(new FileReader(args[0]));
            complexity = new BufferedWriter(new FileWriter(args[1]));
            quickSorted = new BufferedWriter(new FileWriter(args[2]));
            hQuick50sorted = new BufferedWriter(new FileWriter(args[3]));
            hQuick100sorted = new BufferedWriter(new FileWriter(args[4]));
            mQuickSorted = new BufferedWriter(new FileWriter(args[5]));
            mergeSorted = new BufferedWriter(new FileWriter(args[2]));

        } catch (Exception ioe) {
            System.err.println(ioe.toString());
            return;
        }
        int []arrinput;
        String inputNumber="";String strarr="";
        list listinput=new list(0);
        while ((inputNumber= input.readLine())!=null) {
            strarr=strarr+inputNumber;
            strarr.toCharArray();

        }




    }
