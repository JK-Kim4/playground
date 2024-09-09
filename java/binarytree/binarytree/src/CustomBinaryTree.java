import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {

    Node root = null;

    public CustomBinaryTree(){}
    public CustomBinaryTree(Node node){
        this.root = node;
    }

    public Node getRoot(){
        return this.root;
    }

    public void add (int value){
        Node newNode = new Node(value);

        if(this.root == null){this.root = newNode;}

        else if (this.root.getValue() > value){
            this.root.left = insertNode(this.root.left, newNode);
        }

        else if (this.root.getValue() < value){
            this.root.right = insertNode(this.root.right, newNode);
        }

    }

    //root 노드를 시작으로 너비 우선 탐색
    public void bfs(){

        //방문 Node 저장 queue
        Queue<Node> visited = new LinkedList<>();

        //현재 Node
        Node currentNode = null;

        visited.add(this.root);

        while (visited.size() > 0){
            //do something
            currentNode = visited.remove();

            System.out.println(currentNode.getValue());

            if (currentNode.left != null) visited.add(currentNode.left);
            if (currentNode.right != null) visited.add(currentNode.right);
        }


        System.out.println("BFS IS END");
    }

    public boolean isEmpty(){
        return (this.root == null);
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


}



