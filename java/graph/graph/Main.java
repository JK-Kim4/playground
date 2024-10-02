package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String[]> target = new HashMap<>();
        target.put("A", new String[]{"B", "D", "E"});
        target.put("B", new String[]{"A", "C", "D"});
        target.put("C", new String[]{"B"});
        target.put("D", new String[]{"A", "B"});
        target.put("E", new String[]{"A"});

        graph.GraphMap g = new graph.GraphMap(target);

        List<String > resultBfs = g.bfs("A");
        List<String > resultDfs = g.dfs("A", new ArrayList<>());


        for (String s : resultBfs) {
            System.out.println(s);
        }

        System.out.println("======================");
        for (String s : resultDfs) {
            System.out.println(s);
        }
    }
}
