public class Node {

    int value;

    Node left;

    Node right;
    public Node (int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node (int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public int getValue(){
        return this.value;
    }

}
