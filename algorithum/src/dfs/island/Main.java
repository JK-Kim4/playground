package dfs.island;

public class Main {

    public static void main(String[] args) {
        int[][] map = {
            {1,1,0,0,0,1,0},
            {0,1,1,0,1,1,0},
            {0,1,0,0,0,0,0},
            {0,0,0,1,0,1,1},
            {1,1,0,1,1,0,0},
            {1,0,0,0,1,0,0},
            {1,0,1,0,1,0,0}
        };

        Island island = new Island(map);

        island.find();

        System.out.println(island.islands);
    }

}
