package dfs.subset2;

public class SubSet2 {

    int elements;
    int total;
    int[] set;
    boolean flag = false;

    public SubSet2(int[] set) {
        this.set = set;
        this.elements = set.length;
        for (int i : set) {
            total += i;
        }
    }

    public void find(int n, int goal, int sum) {
        if (flag) return;

        if (n > elements-1) return;

        if (goal == sum) {
            flag = true;
            System.out.println("sum = " + sum + ", goal = " + goal);
            return;
        }

        find(n+1, goal, sum + set[n]);
        find(n+1, goal, sum);
    }
}
