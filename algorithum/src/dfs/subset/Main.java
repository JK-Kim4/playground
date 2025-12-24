package dfs.subset;

public class Main {

    public static void main(String[] args) {
        Subset subset = new Subset(6);
        subset.dfs(0);
        subset.printCounts();
    }
}
