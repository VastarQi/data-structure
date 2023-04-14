public class HNode {
    //data store the character of the alphabet
    public Object data;
    private int NodeID;
    //this is the weight (frequency) of the Node
    public int weight;
    //define the left and right node
    private HNode left;
    private HNode right;

    /**
     * This define the huffman node
     * @param data
     * @param weight
     */
    public  HNode(Object data,int weight){
        this.data=data;
        this.weight=weight;
    }


    public Object getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public int getNodeID() {
        return NodeID;
    }

    public void setNodeID(int nodeID) {
        NodeID = nodeID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HNode getLeft() {
        return left;
    }

    public void setLeft(HNode left) {
        this.left = left;
    }

    public HNode getRight() {
        return right;
    }

    public void setRight(HNode right) {
        this.right = right;
    }
}



