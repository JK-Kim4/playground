public class Main {

    public static void main(String[] args) {

        CustomBinaryTree tree = new CustomBinaryTree();

        tree.add(8);
        tree.add(7);
        tree.add(2);
        tree.add(12);
        tree.add(15);


        /*System.out.println(tree.getRoot().getValue());                          //8
        System.out.println(tree.getRoot().getLeft().getValue());                //7
        System.out.println(tree.getRoot().getRight().getValue());               //12
        System.out.println(tree.getRoot().getLeft().getLeft().getValue());      //2
        System.out.println(tree.getRoot().getRight().getRight().getValue());    //15*/

        tree.bfs();

    }
}
