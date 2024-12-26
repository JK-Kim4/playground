
/**
 * 계단을 올라가고있다. 한 번 올라갈 때 1step 혹은 2step 올라갈 수 있다.
 * 문제에서 정수형 배열 cost가 주어지는데, cost[i]는 i번째 계단을 밟았을 때 지불해야 하는 비용이다.
 *
 * 처음 시작은 index 0 또는 1 중 한 곳에서 시작할 수 있다.
 *
 * 이 계단의 꼭대기에 도착하기 위해 지불해야하는 비용의 최소값을 반환하라
 * */
public class MinCostClimbing {

    private int[] cost;

    public MinCostClimbing(int[] cost) {
        this.cost = cost;
    }

    public int minCostClimbingUsingDfs(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        return Math.min((minCostClimbing(n-1) + this.cost[n-1]) , (minCostClimbing(n-2) + this.cost[n-2]) );

    }



}
