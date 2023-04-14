public class BinTree {
    //First we define the root node
    static Node root;
    static int CurNode=0;
    BinTree(){
        root = null;}
    //define the addNode method to add the data into the node
    private Node addNode(Node CurNode, char data) {
        if (CurNode == null) {
            return new Node(data);
        }
        if (data < CurNode.data) {
            CurNode.left = addNode(CurNode.left, data);
        } else if (data > CurNode.data) {
            CurNode.right = addNode(CurNode.right, data);
        } else {
            return CurNode;
        }
        return CurNode;
    }
/*    public void addNode(int data) {
        root = addNode(root, data);
    }*/
    //Method CreatTree is used to construct the binary tree we are going to use
    static Node CreatTree(char input[], int index) {
        if (index > input.length) {
            return null;
        }
        CurNode = index;
        //In Lab 2 the operator should be placed at each node
        if (!distingChar.isOperators(input[index])) {
            return new Node(input[index]);
        }
        //the operons should be placed at the leaves
        else {
            Node node = new Node(input[index]);
            node.left = CreatTree(input, index + 1);
            node.right = CreatTree(input, CurNode+1);
            return node;
        }


    }
}




