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

public class ShortestPath {

    public static void main(String[] args) {

    }

    public static int shortestPathBinaryMatrix(int[][] grid){
        int shortestPathLength = -1;

        int row = grid.length;
        int column = grid[0].length;




        return shortestPathLength;

    }
}
