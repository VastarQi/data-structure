import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ReadFreq {
    private HNode[] list;
    private int elementPointer;
    private int length;
    public int freq=0;
    public char alphabet;



    public int size(){
        return elementPointer;
    }
    public HNode pop(){
        elementPointer--;
        HNode temp = list[elementPointer];
        list[elementPointer] = null;
        return temp;
    }
    public HNode peek(){
        return list[elementPointer-1];
    }

    public HNode FreqTable(String input){
        int freq;
        char alphabet;
        String first="";

        first = input.replaceAll(" - ","");

        //HuffmanNode.data=AlphabetFreq.charAt(0);
        alphabet=first.charAt(0);
        first=first.replaceAll("[a-zA-Z]","");
        first = input.replaceAll("[^0-9]","");
        freq=Integer.parseInt(first);
//        System.out.println(first);

        HNode nodeinfreqTable=new HNode('\0',0);
        nodeinfreqTable.setWeight(freq);
        nodeinfreqTable.setData(alphabet);
        return nodeinfreqTable;
    }

    public ReadFreq(int length){
        this.length=length;
        list= new HNode[length];
        elementPointer=0;
    }

    /**
     * this is used to sort the nodes and build prioritylist
     * @param node
     */
    public void insertion(HNode node){
        if (elementPointer==0){
            list[elementPointer]=node;
            elementPointer++;
        }
        else {
            int i=0;
            for(i=elementPointer-1;i>=0;i--){
                if (node.getWeight()>=list[i].getWeight()){
                    list[i+1]=list[i];
                }
//                if (node.getWeight()==list[i].getWeight()){
//                    if (node.getData().toString().length()<list[i].getData().toString().length()) {
//                        list[i+1] = list[i];
//                    }
//                    else {
//                        list[i] = list[i];
//                    }
//
//                    }

                else {
                    break;
                }
            }
            list[i+1]=node;
            elementPointer++;
        }


    }
}
