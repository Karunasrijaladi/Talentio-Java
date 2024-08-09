import java.util.ArrayList;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {
        /*
          int[] arr = { 1, 0, 1, 2, 2, 1, 0 };
          int count = 0;
          for (int i = 0; i < arr.length; i++) {
          if (!(arr[i] == 0)) {
          arr[count++] = arr[i];
          }
          }
          while (count < arr.length) {
          arr[count++] = 0;
          }
          for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
          }
          int[] arr = { 1, 0, 1, 2, 2, 1, 0 };
          int count = 0, i = 0;
          while (i < arr.length) {
          if (arr[i] == 0) {
          i++;
          continue;
          } else {
          arr[count++] = arr[i];
          i++;
          }
          }
          while (count < arr.length) {
          arr[count++] = 0;
          }
          for (int j = 0; j < arr.length; j++) {
          System.out.print(arr[j] + " ");
         * }
         * System.out.println();
         */
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // int largestsum = 0;
        // int sum = 0;
        // int negativesum=0;
        // for (int i = 0; i < nums.length; i++) {
        // sum += nums[i];
        // if (sum > largestsum) {
        // largestsum = sum;
        // }
        // if (sum < 0) {
        // sum = 0;
        // }
        // }
        // System.out.println(largestsum)
        boolean[] a = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i] - 1] = true;
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                b.add(i + 1);
            }
        }
        System.out.println(b);
    }
}
