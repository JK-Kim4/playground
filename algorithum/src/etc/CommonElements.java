package etc;

import java.util.Arrays;

public class CommonElements {

    int[] array1;
    int[] array2;

    int pointer1;
    int pointer2;

    public CommonElements(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
        this.pointer1 = 0;
        this.pointer2 = 0;

        Arrays.sort(array1);
        Arrays.sort(array2);
    }

    public int[] execute() {
        int[] temp = new int[array1.length + array2.length];
        int index = 0;

        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] == array2[pointer2]) {
                temp[index++] = array1[pointer1++];
                pointer2++;
            } else if (array1[pointer1] < array2[pointer2]) {
                pointer1++;
            } else if  (array1[pointer1] > array2[pointer2]) {
                pointer2++;
            }
        }
        return temp;
    }

}
