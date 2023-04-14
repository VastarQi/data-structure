import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/*

 */
public class HuffmanTree {
    HNode root;
    HNode Current;
    HuffmanTree(){
    root=null;}
    ReadFreq list=new ReadFreq(26);
    /**
     * this is used to read the input frequency table, based on the prioritylist we built
     * @param Freq
     * @return
     */
    public Map BuildTable(ReadFreq Freq){
        //build the HuffmanTree based on the frequency table
        HNode Tree= BuildTree(Freq);
        Map<String,String>map=new HashMap<String,String>();
        this.Traverse(map,Tree,"");
//        Coding(inputstr,map);
//        PrintTable(map);
//        System.out.println(map);
        return map;
    }
    /**
     * This is the method used to code the input cleartext string into Huffman code.
     * @param str
     * @param map
     * @return
     */
    public static String Coding(String str,Map<String,String>map){
        StringBuffer buffer=new StringBuffer();
        char[]array=str.toCharArray();
        for (char a:array){
            buffer.append(map.get(String.valueOf(a).toUpperCase()));
        }
//        System.out.println(map);
        return buffer.toString();

    }

    /**
     *This is the method to decode the input Huffman coding string and return a cleartext string
     * @param str
     * @param map
     * @param Tree
     * @return
     */
    public static String decoding(String str,Map<String,String>map,HNode Tree){
        StringBuffer buffer=new StringBuffer();
        HNode HTree=Tree;
        char[] charcode=str.toCharArray();
        int i=0;
//        System.out.println(map);
        int[] intcode=new int[charcode.length];
        for (i=0;i<charcode.length;i++){
            intcode[i]=Character.getNumericValue(charcode[i]);

        }

        for(int a=0;a<intcode.length;a++){
            if(intcode[a]==0){
//                System.out.println("a="+a);
//                System.out.println(intcode[a]);
                if (Tree.getRight()==null&&Tree.getLeft()==null){
                    buffer.append(Tree.getData().toString());
//                    System.out.println("!");
                    Tree=HTree;
                    a=a-1;
                }else {
                    Tree=Tree.getLeft();
//                    System.out.println("<");
                }
            }
            else {if (intcode[a]==1){
//                System.out.println("a="+a);
//                System.out.println(intcode[a]);
                if (Tree.getRight()==null&&Tree.getLeft()==null){
                    buffer.append(Tree.getData().toString());
//                    System.out.println("!");
                    Tree=HTree;
                    a=a-1;
                }else {
                    Tree=Tree.getRight();

                    }
//                    System.out.println(">");
                }
            }
        }
        if (Tree.getRight()==null&&Tree.getLeft()==null){
            buffer.append(Tree.getData().toString());
        }else {
            System.out.println("Codes can not be decompress, check your input code");
        }


        return buffer.toString();

    }


    /**
     * This is used to bulid the huffman tree based on the priority list
     * @param list
     * @return
     */
    public static HNode BuildTree(ReadFreq list) {
        while (list.size()>1){
            HNode node1=list.pop();
            HNode node2=list.pop();
            //System.out.println(node1.getWeight());
            //System.out.println(node2.getWeight());
            HNode root=new HNode("\0", node1.getWeight()+node2.getWeight());
            root.setLeft(node1);
            root.setRight(node2);
            list.insertion(root);
            //System.out.println(list.peek().getWeight());
        }
        return list.peek();
    }

    /**
     * this is a method to preorder Traverse the tree and store the element into a map
     * @param map
     * @param Tree
     * @param code
     */

    public static void Traverse(Map<String,String>map,HNode Tree,String code){
        if(Tree.getLeft() == null && Tree.getRight()==null){
            map.put(""+Tree.getData(), code);
            return;
        }
        if(Tree.getLeft()!=null){

           // System.out.println(code);
            Traverse(map, Tree.getLeft(), code+"0");

        if(Tree.getRight()!=null){

           // System.out.println(code);
            Traverse(map, Tree.getRight(), code+"1");

    }




    }}}


