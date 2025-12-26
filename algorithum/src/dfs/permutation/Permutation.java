package dfs.permutation;

import java.util.ArrayList;

public class Permutation {

    int m, n;
    int[] numbers;

    public Permutation(int m, int n) {
        this.m = m;
        this.n = n;

        this.numbers = new int[n];
    }

    public void execute(int index) {
        if (index == n) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= m; i++) {
                numbers[index] = i;
                execute(index+1);
            }
        }
    }


}
