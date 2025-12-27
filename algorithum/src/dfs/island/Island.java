package dfs.island;

public class Island {

    private static final int[][] DIRECTIONS = {
        {1, 0}, {1, 1}, {1, -1}, {-1, 0}, {-1, 1}, {-1, -1}, {0, 1}, {0, -1}
    };

    int[][] map;
    boolean[][] visited;
    int islands;

    public Island(int[][] map) {
        this.map = map;
        visited = new boolean[map.length][map[0].length];
    }

    public void find() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    islands++;
                    conquest(i, j);
                }
            }
        }

    }

    private void conquest(int r, int c) {
        map[r][c] = 0;

        for (int[] direction : DIRECTIONS) {
            int nextR = r + direction[0];
            int nextC = c + direction[1];
            if (nextR >= 0 && nextR < map.length && nextC >= 0 && nextC < map[0].length && map[nextR][nextC] == 1) {
                conquest(nextR, nextC);
            }
        }
    }

}
