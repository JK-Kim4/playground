package etc;

public class Main {

    public static void main(String[] args) {
        int[] target = {12,15,11,20,25,10,20,19,13,15};

        SlidingWindow sw = new SlidingWindow(target);

        int result = sw.execute(3);

        System.out.println(result);
    }

}
