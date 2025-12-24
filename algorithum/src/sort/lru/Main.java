package sort.lru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int memories = input.nextInt();
        int numberOfProcesses = input.nextInt();

        int[] caches = new int[memories];
        int[] processes = new int[numberOfProcesses];

        for (int i = 0; i < numberOfProcesses; i++) {
            processes[i] = input.nextInt();
        }

        for (int p : processes) {
            int pos = -1;
            for (int i = 0; i < caches.length; i++) {
                if (p == caches[i]) {
                    pos = i;
                }
            }
            if (pos != -1) {
                for (int i = pos; i >= 1; i--) {
                    caches[i] = caches[i-1];
                }
            } else {
                for (int i = caches.length - 1; i >= 1; i--) {
                    caches[i] = caches[i-1];
                }
            }
            caches[0] = p;
        }

        for (int c : caches) {
            System.out.print(c + " ");
        }
    }

}
