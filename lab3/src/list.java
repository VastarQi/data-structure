import java.util.Locale;

public class list {
    public void CreatList(String input){

    }

    /**
     * this is used for create the huffman node based on the input frequency table, assign the value to the node's data&weight
     * @param input
     * @return
     */
    public HNode CreatNode(String input){
        int freq;
        char alphabet;
        String first="";
        String second="";

        first = input.replaceAll("-","");
        first = first.replaceAll("\s","");
        //HuffmanNode.data=AlphabetFreq.charAt(0);
        alphabet=first.charAt(0);
        second=first.replaceAll("[a-zA-Z]","");
        second = second.replaceAll("-","");
        freq=Integer.parseInt(second);
//        System.out.println(alphabet);

//        System.out.println(first);

        HNode nodeinfreqTable=new HNode("\0",0);
        nodeinfreqTable.setWeight(freq);
        nodeinfreqTable.setData(alphabet);
        return nodeinfreqTable;
    }



}
