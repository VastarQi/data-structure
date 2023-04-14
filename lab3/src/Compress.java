import java.io.*;

public class Compress {
    @SuppressWarnings("unchecked")
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
            //read the frequency table

            ReadFreq table=new ReadFreq(27);


            while ((AlphabetFreq= frequencyTable.readLine())!=null) {
                list l=new list();
                table.insertion(l.CreatNode(AlphabetFreq));
                //System.out.println(table.peek().getWeight());
                //output.write("Your postfix is : " +  mainClearToCode.ClearToEncode(AlphabetFreq,inputCleartext));
        }


            HuffmanTree mainClearToCode=new HuffmanTree();
            mainClearToCode.BuildTable(table);



            while ((inputCleartext= input.readLine())!=null) {
                HuffmanTree mainClearToCode2=new HuffmanTree();
                inputCleartext=inputCleartext.replaceAll(" ","");
                inputCleartext=inputCleartext.replaceAll("\n","");
                //commend this line if need
                inputCleartext=inputCleartext.replaceAll("[^a-zA-Z]","");
                output.write("Your input cleartext is:"+"\n" +inputCleartext);
                output.newLine();
                output.write("You Huffman code of the cleartext is:");
                output.newLine();
                output.write(""+""+HuffmanTree.Coding(inputCleartext,mainClearToCode.BuildTable(table)));
                output.newLine();
            }
            output.close();
        }
}
