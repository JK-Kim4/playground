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

        Graph g = new Graph(target);

        List<String > result = g.bnf("A");

        for (String s : result) {
            System.out.println(s);
        }
    }
}
