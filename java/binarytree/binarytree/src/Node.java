public class Node {

    Integer key;

    Object value;

    Node left;

    Node right;
    public Node (Integer key, Object value){
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node (Integer key, Object value, Node left, Node right){
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Integer getKey(){
        return this.key;
    }

    public Node addNode (Node currentNode, Node newNode){

        if(currentNode.getKey() > newNode.getKey()){

        }

    }
}
