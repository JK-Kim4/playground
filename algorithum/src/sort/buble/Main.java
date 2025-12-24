package sort.buble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] target = new int[count];

        for (int i = 0; i < count; i++) {
            target[i] = input.nextInt();
        }

        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < count-1-i; j++) {
                if (target[j] > target[j+1]) {
                    int temp = target[j+1];
                    target[j+1] =  target[j];
                    target[j] = temp;
                }
            }

        }

        for (int i :  target) {
            System.out.print(i + " ");
        }

    }
}
