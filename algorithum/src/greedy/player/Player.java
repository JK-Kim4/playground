package greedy.player;

public class Player implements Comparable<Player> {

    int w;
    int h;

    public Player(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int compareTo(Player o) {
        if (this.w - o.w == 0) {
            return o.h - this.h;
        }

        return o.w - this.w;
    }

    @Override
    public String toString() {
        return "Player{" +
            "w=" + w +
            ", h=" + h +
            '}';
    }
}
