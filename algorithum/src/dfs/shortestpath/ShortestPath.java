package dfs.shortestpath;

public class ShortestPath {


    public static int findPath(int layer, Node root) {
        if (root.left == null && root.right == null) { return  layer; }

        return Math.min(findPath(layer + 1, root.left), findPath(layer + 1, root.right));
    }


}
