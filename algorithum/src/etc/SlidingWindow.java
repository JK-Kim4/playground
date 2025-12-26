package etc;

public class SlidingWindow {

    int[] targets;

     public SlidingWindow(int[] targets) {
         this.targets = targets;
     }

     public int execute(int n) {
         int result = Integer.MIN_VALUE;

         for (int i = 0; i < targets.length-n; i++) {
             int sum = 0;
             for (int j = i; j < i+n; j++) {
                 sum += targets[j];
             }

             result = Math.max(result, sum);
         }

         return result;
     }

}
