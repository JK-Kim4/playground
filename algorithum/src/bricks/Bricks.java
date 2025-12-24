package bricks;

public class Bricks implements Comparable<Bricks> {

    int baseArea;
    int height;
    int weight;

    public Bricks(int baseArea, int height, int weight) {
        this.baseArea = baseArea;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Bricks other) {
        return other.baseArea - this.baseArea;
    }
}
