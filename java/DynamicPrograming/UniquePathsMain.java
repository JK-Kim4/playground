public class UniquePathsMain {

    public static void main(String[] args) {
        int m = 2;
        int n = 6;

        UniquePaths uniquePaths = new UniquePaths(m,n);
        //uniquePaths.init();
        System.out.println(uniquePaths.solve(m-1, n-1));

    }
}
