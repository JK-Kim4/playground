package dfs.maximumcapacity;

public class MaxCapacity {

    int size;
    int capacity;
    int maxCapacity;
    int[] targets;

    public MaxCapacity(int size, int capacity, int[] targets) {
        this.size = size;
        this.capacity = capacity;
        this.targets = targets;
    }

    public void find (int n, int current) {
        if (current > capacity) { return;}

        if (n == size) {
            maxCapacity = Math.max(maxCapacity, current);
        } else {
            find(n + 1, current + targets[n]);
            find(n + 1, current);
        }
    }

}
