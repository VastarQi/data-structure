public class ReadTree {
    static StringBuilder mid = new StringBuilder();
    static String ToPostfix (Node node){
        //the reading of the tree is a recursion display.
        if (node == null){
            return "";
            //end of the tree reading, that is the base case.
        }
        ToPostfix(node.left);
        ToPostfix(node.right);
        String postorder = mid.append(node.data).toString();
        //postorder is the return result
        return postorder;
    }
}
