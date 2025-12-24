package bfs.lostcow;

import java.util.LinkedList;
import java.util.Queue;

public class LostCow {

    private final static int[] DIRECTIONS = {1, -1, 5};

    private final Queue<Integer> queue = new LinkedList<>();
    private final int end;
    private int round = 0;
    private int[] visited = new int[10001];

    public LostCow(int start, int end) {
        this.queue.add(start);
        this.end = end;
        this.visited[start] = 1;
    }

    public int find() {

        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int current = queue.poll();

                for (int direction : DIRECTIONS) {
                    int next = current + direction;
                    if (next == end) { return round + 1;}
                    if (next >=1 && next <= 10000 && visited[next] == 0) {
                        visited[next] = 1;
                        queue.add(next);
                    }
                }
            }
            round++;
        }

        return -1;
    }


    public static void main(String[] args) {

        LostCow lostCow = new LostCow(5,14);

        int result = lostCow.find();

        System.out.println(result);

    }

}
