import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PrintTreePreorder {

public HNode BuildTreeForPre (ReadFreq list){
        while (list.size()>1){
            HNode node1=list.pop();
            HNode node2=list.pop();
            //System.out.println(node1.getWeight());
            //System.out.println(node2.getWeight());
            HNode root=new HNode(node1.getData().toString()+node2.getData().toString(), node1.getWeight()+node2.getWeight());
            root.setLeft(node1);
            root.setRight(node2);
            list.insertion(root);
            //System.out.println(list.peek().getWeight());
        }
        return list.peek();
    }
    public String PreOrderTraverse(Map<String,String>map,HNode Tree,String code){
        StringBuffer buffer=new StringBuffer();

        if (Tree==null){
            return null;
        }
        System.out.println(Tree.getData().toString()+":"+Tree.weight);
        //buffer.append(Tree.getData().toString()+":"+Tree.weight+System.getProperty("line.separator"));
        PreOrderTraverse(map,Tree.getLeft(),code+"0");
        PreOrderTraverse(map,Tree.getRight(),code+"1");
        return buffer.toString();
    }


    @SuppressWarnings("unchecked")
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

        PrintTreePreorder Printer=new PrintTreePreorder();
        Printer.BuildTreeForPre(table);
        Map<String,String>map=new HashMap<String,String>();
        String code="";
        Printer.PreOrderTraverse(map,Printer.BuildTreeForPre(table),code);





    }}


