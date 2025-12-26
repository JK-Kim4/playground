package dfs.maximumcapacity;

public class Main {

    public static void main(String[] args) {
        int[] targets = {81,58,42,33,61};

        MaxCapacity mc = new MaxCapacity(5, 259, targets);
        mc.find(0,0);

        System.out.println(mc.maxCapacity);


    }

}
