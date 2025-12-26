package dfs.remains;

public class Main {

    public static void main(String[] args) {
        int[] coins = {1,3,5};

        Remains r = new Remains(coins,15);

        r.execute(0, 0);

        System.out.println(r.minimum());
        r.print();
    }

}
