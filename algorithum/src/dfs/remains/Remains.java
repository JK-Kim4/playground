package dfs.remains;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Remains {

    static Set<Integer> set = new HashSet<Integer>();

    int[] coins;
    int target;

    public Remains(int[] coins, int target) {
        this.coins = coins;
        this.target = target;
    }

    public void execute(int count, int sum) {
        if (sum == target) {
            set.add(count);
        } else if (sum < target) {
            for (int coin : coins) {
                execute(count+1, sum + coin);
            }
        } else {
            return;
        }
    }

    public int minimum() {
        return set.iterator().next();
    }

    public void print() {
        for (int i : set) {
            System.out.println(i);
        }
    }

}
