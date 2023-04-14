/*
this is the main entrance of the application
*/

import java.io.*;
public class lab1 {
/*    private static StringBuilder postfix = new StringBuilder();
    private static StringBuilder prefix= new StringBuilder();*/
    public static void main(String[] args) throws IOException{
        BufferedReader input;
        BufferedWriter output;
        String prefix="";
        if (args.length != 2) {
            System.out.println("Usage: java lab1 [input file pathname] [output file pathname]");
            System.exit(1);
            //check the input file path
        }
        try {
            input = new BufferedReader(new FileReader(args[0]));
            output = new BufferedWriter(new FileWriter(args[1]));

        } catch (Exception ioe) {
            System.err.println(ioe.toString());
            return;
        }
        prefix=null;
        while ((prefix= input.readLine())!=null) {
            prefix = prefix.replaceAll("\s","");
            output.write("Your input prefix is:   " + prefix);
            output.newLine();
            //output the prefix before the conversion
            if (checkwrong.Check(prefix)==0){
                output.write("Your postfix is : " + PreToPost.conversion(prefix) + "\n");
                output.newLine();
                output.write("");
                output.newLine();
            //output the correct expression identified by checkwrong.Check
            }
            else {
            if (checkwrong.Check(prefix)==1){
                output.write("input hava invalid element, check your input");
                output.newLine();
                output.write("");
                output.newLine();
            }
            if ((checkwrong.Check(prefix)==2)){
                output.write("Unable to form valid expression, check your input");
                output.newLine();
                output.write("");
                output.newLine();
            }
            }

        }
        output.close();
    }

}
