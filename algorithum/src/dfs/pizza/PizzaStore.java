package dfs.pizza;

import java.util.ArrayList;

public class PizzaStore {

    int limit;
    int len;
    int[][] map;
    int minDistance = Integer.MAX_VALUE;

    int[] current;
    ArrayList<int[]> houses = new ArrayList<>();
    ArrayList<int[]> pizzaStores = new ArrayList<>();


    public PizzaStore(int[][] map, int limit) {
        this.map = map;
        this.limit = limit;
        current = new int[limit];
    }

    public void find() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    houses.add(new int[]{i, j});
                }

                if (map[i][j] == 2) {
                    pizzaStores.add(new int[]{i, j});
                }
            }
        }

        len = pizzaStores.size();

        dfs(0, 0);
    }
    

    private void dfs(int start, int index) {
        
        if (index == limit) {
            int sum = 0;
            for (int[] house : houses) {
                int dist = Integer.MAX_VALUE;
                for (int i : current) {
                    int[] pizzaStore = pizzaStores.get(i);
                    dist = Math.min(Math.abs(house[0] - pizzaStore[0]) + Math.abs(house[1] - pizzaStore[1]), dist);
                }
                sum += dist;
            }
            minDistance = Math.min(minDistance, sum);
        } else {
            for (int i = start; i < pizzaStores.size(); i++) {
                current[index] = i;
                dfs(i + 1, index+1);
            }
        }
    }


}
