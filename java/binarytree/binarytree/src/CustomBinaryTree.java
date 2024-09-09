public class CustomBinaryTree {

    Node root = null;

    public CustomBinaryTree(){}
    public CustomBinaryTree(Node node){
        this.root = node;
    }

    public boolean isEmpty(){
        return (this.root == null);
    }

    public void add (Node currentNode, int value){
        Node newNode = new Node(value);

        if(this.root == null){this.root = newNode;}

        else if (this.root.getValue() > value){
            this.root.left = insertNode(this.root.left, newNode);
        }

        else if (this.root.getValue() < value){
            this.root.right = insertNode(this.root.right, newNode);
        }

    }


    public Node insertNode(Node currentNode, Node newNode){
        if(currentNode == null){
            return newNode;
        }

        else if(currentNode.getValue() > newNode.getValue()){
            currentNode.left = insertNode(currentNode.left, newNode);
        }

        else if(currentNode.getValue() < newNode.getValue()){
            currentNode.right = insertNode(currentNode.right, newNode);
        }

        return currentNode;
    }

    public Node getRoot(){
        return this.root;
    }


}



