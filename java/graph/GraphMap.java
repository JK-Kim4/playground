package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphMap {

    public GraphMap(){}

    public GraphMap(Map<String, String[]> target){
        this.target = target;
    }

    private Map<String, String[]> target = new HashMap<>();

    public List<String > bnf(String startValue){
        List<String> visited = new ArrayList<String>();
        visited.add(startValue);

        List<String> queue = new ArrayList<>();
        queue.add(startValue);
        while(!queue.isEmpty()){
            String currentValue = queue.remove(0);
            for (String value : target.get(currentValue)){
                if(!visited.contains(value)){
                    visited.add(value);
                    queue.add(value);
                }
            }
        }
        return visited;
    }

    public List<String> dfs(String startValue, List<String> pastVisited) {
        List<String> visited = pastVisited;

        visited.add(startValue);
        for(String s : target.get(startValue)){
            if(!visited.contains(s)){
                visited = this.dfs(s, visited);
            }
        }

        return visited;
    }


}
