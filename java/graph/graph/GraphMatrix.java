package graph;

public class GraphMatrix {

    private int rows;
    private int columns;

    private int[][] gird;

    public GraphMatrix(int rows, int columns){
        this.gird = new int[rows][columns];
    }
}
