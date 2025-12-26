package etc;

public class TwoPointer {

    int pointer1;
    int pointer2;
    int index;

    int[] array1;
    int[] array2;

    public TwoPointer (int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;

        this.index = 0;
        this.pointer1 = 0;
        this.pointer2 = 0;

    }

    public int[] combine() {
        int[] result = new int[array1.length + array2.length];


        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] < array2[pointer2]) {
                result[index++] = array1[pointer1++];
            } else {
                result[index++] = array2[pointer2++];
            }
        }

        while (pointer1 < array1.length) {
            result[index++] = array1[pointer1++];
        }

        while (pointer2 < array2.length) {
            result[index++] = array2[pointer2++];
        }

        return result;
    }

}
