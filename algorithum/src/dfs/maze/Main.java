package dfs.maze;

public class Main {

    public static void main(String[] args) {
        int[][] map =
            {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        Maze maze = new Maze(map);

        int result = maze.search(0, 0, 1);

        System.out.println(result);
    }

}
