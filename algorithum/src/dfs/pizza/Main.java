package dfs.pizza;

public class Main {

    public static void main(String[] args) {
        int[][] map = {
            {0,1,2,0},
            {1,0,2,1},
            {0,2,1,2},
            {2,0,1,2}
        };

        PizzaStore ps = new PizzaStore(map,4);

        ps.find();

        System.out.println(ps.minDistance);
    }

}
