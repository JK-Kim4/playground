package sort.classmate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] target = new int[count];


        for (int i = 0; i < count; i++) {
            target[i] = input.nextInt();
        }

        int[] copy = target.clone();
        Arrays.sort(copy);

        for (int i = 0; i < count; i++) {
            if (target[i] != copy[i]) {
                result.add(i+1);
            }
        }

        for (Integer i : result) {
            System.out.print(i.toString() + " ");
        }
    }

}
