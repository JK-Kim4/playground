package dfs.maze;

public class Maze {

    private static final int[][] directions = {
        {1,0}, {-1,0}, {0,1}, {0,-1}
    };

    int[][] maze;
    int maxRow, maxColumn;

    public Maze(int[][] maze) {
        this.maze = maze;
        this.maxRow = maze.length;
        this.maxColumn = maze[0].length;
    }

    public int search(int row, int col, int count) {

        // 범위/벽 체크
        if (row < 0 || row >= maxRow || col < 0 || col >= maxColumn) return -1;
        if (maze[row][col] == 0) return -1;

        // 도착
        if (row == maxRow - 1 && col == maxColumn - 1) {
            return count;
        }

        maze[row][col] = 0;

        int best = Integer.MAX_VALUE;

        for (int[] d : directions) {
            int nr = row + d[0];
            int nc = col + d[1];

            int result = search(nr, nc, count + 1);
            if (result != -1) {
                best = Math.min(best, result);
            }
        }

        maze[row][col] = 1;

        return best == Integer.MIN_VALUE ? -1 : best;
    }

}
