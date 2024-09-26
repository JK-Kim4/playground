package graph;

public class NumberOfIslands {

    public static void main(String[] args) {

        int numberOfIslands = 0;
        int[][] answer1 = new int[4][5];

        answer1[0][0] = 1;
        answer1[0][1] = 1;
        answer1[0][2] = 1;
        answer1[0][3] = 1;

        answer1[1][0] = 1;
        answer1[1][1] = 1;
        answer1[1][3] = 1;

        answer1[2][0] = 1;
        answer1[2][1] = 1;

        for(int i = 0; i < answer1.length; i++){
            for(int j = 0; j < answer1[0].length; j++){
                if(answer1[i][j] == 1){
                    dfs(i, j, answer1);
                    numberOfIslands++;
                }
            }
        }

        System.out.println(numberOfIslands);

    }

    public static void dfs(int x, int y, int[][] grid){
        //parameter로 전달받은 start point값이 visited에 포함되어 있을 경우 -> pass

        //parameter로 전달받은 start point값이 visited에 포함되어있지 않을 경우 -> nest step
        grid[x][y] = 0;

        /*
        start point 기준 상하좌우 value 조회
            - 조회한 값이 0일 경우 pass
            - 조회한 값이 1일 경우 해당 point로 dfs 재귀 호출
        */
        if(x > 0 && grid[x-1][y] == 1) dfs(x-1, y, grid);
        if(x < grid.length && grid[x+1][y] == 1) dfs(x+1, y, grid);
        if(y > 0 && grid[x][y-1] == 1) dfs(x, y-1, grid);
        if(y < grid[0].length && grid[x][y+1] == 1) dfs(x, y+1, grid);
    }
}
