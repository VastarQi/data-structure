import java.io.*;

public class Decompress {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader input;
        BufferedReader frequencyTable;
        BufferedWriter output;
        String AlphabetFreq = "";
        String inputCodetext="";
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
        String str="";
        ReadFreq read=new ReadFreq(26);
        ReadFreq table=new ReadFreq(27);
        //This while loop is to read the freqency Table, build the nodes and create the priority queue
        while ((AlphabetFreq= frequencyTable.readLine())!=null) {
            list l=new list();
            table.insertion(l.CreatNode(AlphabetFreq));
            //System.out.println(table.peek().getWeight());
            //output.write("Your postfix is : " +  mainClearToCode.ClearToEncode(AlphabetFreq,inputCleartext));
        }
        //then we get the Huffman Tree based on the table.
        HuffmanTree mainClearToCode=new HuffmanTree();
        mainClearToCode.BuildTable(table);

        while ((inputCodetext= input.readLine())!=null) {
            HuffmanTree mainClearToCode2=new HuffmanTree();
            inputCodetext=inputCodetext.replaceAll(" ","");
            output.write("Your input code is:"+"\n" +inputCodetext);
            output.newLine();
            output.write("Your cleartext  of the Huffman code is:");
            output.newLine();
            output.write(""+""+HuffmanTree.decoding(inputCodetext,mainClearToCode.BuildTable(table),mainClearToCode.BuildTree(table)));
            output.newLine();
        }
        output.close();
    }
}