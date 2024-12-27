public class UniquePathsMain {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        UniquePaths uniquePaths = new UniquePaths(m,n);
        uniquePaths.init();

        System.out.println(uniquePaths.getPaths());

    }
}
