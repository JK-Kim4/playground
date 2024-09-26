package graph;

import java.util.Arrays;
import java.util.List;

public class GraphMatrix {

    private int rows;
    private int columns;

    private int[][] grid;

    public int[][] getGrid(){
        return this.grid;
    }

    public GraphMatrix(int rows, int columns){
        this.grid = new int[rows][columns];
    }

    public GraphMatrix(int[][] matrix){
        this.grid = matrix;
    }

    public void dfs(int x, int y){


        //parameter로 전달받은 start point값이 visited에 포함되어 있을 경우 -> pass

        //parameter로 전달받은 start point값이 visited에 포함되어있지 않을 경우 -> nest step
        if(this.grid[x][y] == 1){
            this.grid[x][y] = 0;

            /*
            start point 기준 상하좌우 value 조회
                - 조회한 값이 0일 경우 pass
                - 조회한 값이 1일 경우 해당 point로 dfs 재귀 호출
            */
            try {
                if(this.grid[x-1][y] > 0) this.dfs(x-1, y);
                if(this.grid[x+1][y] > 0) this.dfs(x+1, y);
                if(this.grid[x][y-1] > 0) this.dfs(x, y-1);
                if(this.grid[x][y+1] > 0) this.dfs(x, y+1);
            }catch (IndexOutOfBoundsException e){
                System.out.println("out of bound");
            }

        }

    }

    public void printGrid(){
        for( int i = 0; i < this.grid.length; i++){
            System.out.println();
            for( int j = 0; j < this.grid[0].length; j++){
                System.out.print(this.grid[i][j]);
            }
        }
    }
}
