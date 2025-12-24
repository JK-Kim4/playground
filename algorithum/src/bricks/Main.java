package bricks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] dy;

    public static int solution(List<Bricks> bricks) {
        int result = Integer.MIN_VALUE;
        //넓이 내림차순 정렬
        Collections.sort(bricks);
        dy[0] = bricks.get(0).height;
        result = dy[0];

        for (int i = 1; i < bricks.size(); i++) {
            int maxH = 0;
            for (int j = i-1; j >= 0; j--) {
                if (bricks.get(j).weight > bricks.get(i).weight && dy[j] > maxH) {
                    maxH = dy[j];
                }
            }
            dy[i] = maxH + bricks.get(i).height;
            result = Math.max(result, dy[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        List<Bricks> bricks = new ArrayList<>();
        dy = new int[count];

        for (int i = 0; i < count; i++) {
            int area =  input.nextInt();
            int height = input.nextInt();
            int weight = input.nextInt();
            bricks.add(new Bricks(area, height, weight));
        }

        System.out.println(solution(bricks));
    }
}
