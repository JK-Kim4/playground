package dfs.maximumscore;

public class Main {

    public static void main(String[] args) {
        int[][] problems = {
            {10, 5},
            {25,12},
            {15,8},
            {6,3},
            {7,4},
        };


        MaxScore ms = new MaxScore(20, problems);

        ms.solve(0, 0, 0);

        System.out.print(ms.maximumScore);
    }

}
