package greedy.player;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player(172,62);
        Player p2 = new Player(183, 65);
        Player p3 = new Player(180, 70);
        Player p4 = new Player(170,72);
        Player p6 = new Player(170,79);
        Player p5 = new Player(181,60);

        Player[] players = {p1,p2,p3,p4,p5, p6};

        Arrays.sort(players);

        int result = 0;
        int max = Integer.MIN_VALUE;

        for (Player p : players) {
            if (max < p.h) {
                result++;
                max = p.h;
            }
        }

        System.out.println(result);

    }

}
