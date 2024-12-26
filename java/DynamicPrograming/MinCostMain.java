public class MinCostMain {

    public static void main(String[] args) {

        int[] cost = {10,15,20,17,1};
        MinCostClimbing minCostClimbing = new MinCostClimbing(cost);

        int minCost = minCostClimbing.minCostClimbingUsingDfs(cost.length);
        System.out.println("min cost = " + minCost);

    }
}
