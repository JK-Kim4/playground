package sort.insert;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int j = 0;
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] target = new int[count];

        for (int i = 0; i < count; i++) {
            target[i] = input.nextInt();
        }

        for (int i = 1; i < count; i++) {
            int temp = target[i];
            for (j = i-1; j >= 0; j--) {
                if (target[j] > temp) {
                    target[j+1] = target[j];
                } else {

                    break;
                }
            }
            target[j+1] = temp;
        }

        for (int ii :  target) {
            System.out.print(ii + " ");
        }
    }

}
