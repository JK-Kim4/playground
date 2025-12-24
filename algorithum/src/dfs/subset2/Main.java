package dfs.subset2;

import dfs.subset.Subset;

public class Main {

    public static void main(String[] args) {
        int[] param = {1,3,5,6,7,10};

        SubSet2 subset2 = new SubSet2(param);

        subset2.find(0, 32, 0);

        System.out.println(subset2.flag);
    }

}
