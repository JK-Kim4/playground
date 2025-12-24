package dfs.subset;

public class Subset {


    private int[] flags;
    private int number;
    private int count;

    public Subset(int number) {
        this.number = number;
        this.count = 0;
        this.flags = new int[number];
    }

    public void dfs(int current) {
        if (number == 0) return;

        if (current == number) {
            // 출력
            for (int i = 0; i < number; i++) {
                if (flags[i] == 1) {
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println();
            count++;
            return;
        } else {
            flags[current] = 1;
            dfs(current + 1);
            flags[current] = 0;
            dfs(current + 1);
        }
    }

    public void printCounts() {
        System.out.println(count);
    }
}
