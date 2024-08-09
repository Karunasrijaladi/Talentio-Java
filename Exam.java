import java.util.*;

class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] brr = new int[n2];
        for (int i = 0; i < n2; i++) {
            brr[i] = sc.nextInt();
        }
        List<Integer> b = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if ((brr[n2 - 1] - brr[0]) <= 100) {
            HashMap<Integer, Integer> set = new HashMap<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n1; i++) {
                if (!set.containsKey(arr[i])) {
                    set.put(arr[i], 1);
                } else {
                    set.put(arr[i], set.get(arr[i]) + 1);
                }
            }
            for (int i = 0; i < n2; i++) {
                if (!map.containsKey(brr[i])) {
                    map.put(brr[i], 1);
                } else {
                    map.put(brr[i], set.get(brr[i]) + 1);
                }
            }
            int k = 0;
            for (int i : set.keySet()) {
                for (int j : map.keySet()) {
                    if (i == j) {
                        if (map.get(j) > set.get(i)) {

                            b.add(i);
                        }
                    }
                }
            }
        }

        System.out.println(b);
    }
}