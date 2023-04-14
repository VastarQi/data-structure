import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PrintHuffmanCodeTable {

    public Map Print(ReadFreq Freq){
        HNode tree=HuffmanTree.BuildTree(Freq);
        Map<String,String>map=new HashMap<String,String>();
        HuffmanTree.Traverse(map,tree,"");
        return map;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input;
        BufferedReader frequencyTable;
        BufferedWriter output;
        String AlphabetFreq = "";
        String inputCleartext="";
        char alphabet;

        if (args.length != 1) {
            System.out.println("Usage: java Lab3 [frequencyTable file pathname]");
            System.exit(1);
            //check the input file path
        }
        try {
            frequencyTable=new BufferedReader(new FileReader(args[0]));

        } catch (Exception ioe) {
            System.err.println(ioe.toString());
            return;
        }
        ReadFreq table=new ReadFreq(27);


        while ((AlphabetFreq= frequencyTable.readLine())!=null) {
            list l=new list();
            table.insertion(l.CreatNode(AlphabetFreq));
        }
        PrintHuffmanCodeTable printer=new PrintHuffmanCodeTable();
        System.out.println(printer.Print(table));
    }
}
