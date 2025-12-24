package sort.select;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] target = new int[count];

        for(int i = 0; i < count; i++){
            target[i] = input.nextInt();
        }

        for (int i = 0; i < count-1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (target[i] > target[j]) {
                    int temp = target[i];
                    target[i] = target[j];
                    target[j] = temp;
                }
            }
        }

        for (int i : target) {
            System.out.print(i + " ");
        }
    }

}
