package graph;

/*
    문제:
    n X n의 이진 트리인 grid가 주어졌을 때, 출발지에서 목적지까지 가는 가장 빠른 경로의 길이를 반환
    (경로가 존재하지 않는다면 -1을 반환)

    출발지: top left (0,0) 
    도착지: bottom right (n-1,n-1)

    - 값이 0인 cell만 지나갈 수 있음
    - cell은 8방향으로 연결
    - 연결된 cell을 통해서만 이동 가능
*/

import java.util.ArrayList;

public class ShortestPath {

    public static void main(String[] args) {

        int[][] grid1 ,grid2, grid3, grid4;

        grid1 = new int[][]{
                {0,0,0},
                {1,1,0},
                {1,1,0}
        };
        grid2 = new int[][]{
                {1,0,0},
                {1,1,0},
                {1,1,0}
        };
        grid3 = new int[][]{
                {0,0,0,1,0,0,0},
                {0,1,1,1,0,1,0},
                {0,1,0,0,0,1,0},
                {0,0,0,1,1,1,0},
                {0,1,0,0,0,0,0},
        };

        grid4 = new int[][]{
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
        };

        int result1 = shortestPathBinaryMatrix(grid1); // 4
        System.out.println("result 1 shortest path = " + result1);

        int result2 = shortestPathBinaryMatrix(grid2); // -1
        System.out.println("result 2 shortest path = " + result2);

        int result3 = shortestPathBinaryMatrix(grid3); // 9
        System.out.println("result 3 shortest path = " + result3);

//        int result4 = shortestPathBinaryMatrix(grid4);
//        System.out.println("result 4 shortest path = " + result4);

    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int shortestPathLength = -1;

        int[][] deltas = new int[][]{
            {1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}
        };

        boolean[][] visited = new boolean[rows][columns];

        ArrayList<int[]> queue = new ArrayList<>();
        queue.add(new int[]{0,0,1});


        if(grid[0][0] != 1) {
            visited[0][0] = true;

            while (!queue.isEmpty()){
                int[] currentNode = queue.remove(0);
                int curRow = currentNode[0];
                int curColumn = currentNode[1];

                //탈출 조건 1: 현재 노드가 도착지점을 가르킬 때
                if(curRow == rows -1 && curColumn == columns -1){
                    shortestPathLength = currentNode[2];
                    break;
                }

                for(int[] delta: deltas){
                    int nextRow = curRow + delta[0]; int nextColumn = curColumn + delta[1];
                    if (nextRow < rows  && nextRow >= 0 && nextColumn < columns && nextColumn >= 0){
                        if(grid[nextRow][nextColumn] == 0 && !visited[nextRow][nextColumn]){
                            queue.add(new int[]{nextRow, nextColumn, currentNode[2] + 1});
                            visited[nextRow][nextColumn] = true;
                        }
                    }

                }

            }
        }

        return shortestPathLength;
    }

}
