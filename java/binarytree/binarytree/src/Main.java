public class Main {

    public static void main(String[] args) {

        CustomBinaryTree tree = new CustomBinaryTree();

        tree.add(tree.root, 5);
        tree.add(tree.root, 4);
        tree.add(tree.root, 7);
        tree.add(tree.root, 2);
        tree.add(tree.root, 3);


        System.out.println(tree.getRoot().getValue());              //5
        System.out.println(tree.getRoot().getLeft().getValue());    //4
        System.out.println(tree.getRoot().getRight().getValue());   //7
        System.out.println(tree.getRoot().getLeft().getLeft().getValue());   //2
        System.out.println(tree.getRoot().getLeft().getLeft().getRight().getValue());   //3

    }
}
