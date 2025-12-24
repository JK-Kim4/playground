package bfs.shortestpath;

import java.util.LinkedList;
import java.util.Queue;


public class ShortestPath {

    public static int find(Node start) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        int result = 0;

        while (!queue.isEmpty()) {


            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (current.left == null && current.right == null) { return result; }
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            result++;
        }

        return result;
    }

}
