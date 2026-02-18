package dfs.chicken;

public class Main {

    public static void main(String[] args) {
        int[][] roads = {
            {1,3},
            {4,2},
            {1,5},
            {3,2}
        };


        Chicken c = new Chicken(5,4, roads);

        c.solve();
        c.printResult();

    }

}
