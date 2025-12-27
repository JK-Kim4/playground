package dfs.uniquePath;

public class Main {

    public static void main(String[] args) {
        UniquePath up = new UniquePath(3,2);
        up.search(0,0);

        System.out.println(up.pathCount);
    }

}
