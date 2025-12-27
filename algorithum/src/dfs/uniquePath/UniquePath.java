package dfs.uniquePath;

public class UniquePath {

    private static final int[][] DIRECTIONS = {
        {1,0}, {0,1}
    };

    int m;
    int n;
    int pathCount;

    public UniquePath(int m, int n) {
        this.m = m;
        this.n = n;
        this.pathCount = 0;
    }


    public void search(int r, int c) {
        if (r == m-1 && c == n-1) pathCount++;

        for (int[] direction : DIRECTIONS) {
            int nextR = r + direction[0];
            int nextC = c + direction[1];

            if (nextR < m && nextC < n) search(nextR, nextC);
        }
    }
}
