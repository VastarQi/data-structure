
import java.io.*;

public class Lab2 {
    static StringBuilder postfix = new StringBuilder();
    //we need to converse the input data into array


    static String toPostfix (Node node){

        if (node == null){
            return "";
        }
        toPostfix(node.left);
        toPostfix(node.right);

        String postfixed = postfix.append(node.data).toString();

        return postfixed;}

    public static void main(String[] args) throws IOException{

        BufferedReader input;
        BufferedWriter output;
        String prefix="";
        if (args.length != 2) {
            System.out.println("Usage: java lab2 [input file pathname] [output file pathname]");
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

            //output the prefix before the conversion

        while ((prefix=input.readLine())!=null) {

            prefix = prefix.replaceAll("\s","");
            output.write("Your input prefix is:   " + prefix);
            output.newLine();

            if (checkwrong.Check(prefix)==0){
                char[] prefix_char = ToArray.Trans(prefix);
                Node prefix_tree = BinTree.CreatTree(prefix_char, 0);
                output.write("Your postfix is : " +toPostfix(prefix_tree) + "\n");
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
            }}output.close();
    }
}

