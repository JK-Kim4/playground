package dfs.maximumscore;

public class MaxScore {

    int[][] problems;
    int limitTime;

    int maximumScore;

    public MaxScore(int limitTime, int[][] problems) {
        this.limitTime = limitTime;
        this.problems = problems;
    }

    public void solve (int n, int spentTime, int currentScore) {

        if (spentTime > limitTime) {
            return;
        }

        if (n >= problems.length) {
            maximumScore = Math.max(maximumScore, currentScore);
        }

        else {
            solve(n + 1, spentTime + problems[n][1], currentScore + problems[n][0]);
            solve(n + 1, spentTime, currentScore);
        }

    }

}
