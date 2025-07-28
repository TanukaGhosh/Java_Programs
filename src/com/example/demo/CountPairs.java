package src.com.example.demo;
import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static int getPairsCount(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = sum - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println("Count of pairs: " + getPairsCount(arr, sum)); // Output: 3
    }
}
